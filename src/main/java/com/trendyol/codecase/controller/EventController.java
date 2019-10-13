package com.trendyol.codecase.controller;

import com.trendyol.codecase.model.Campaign;
import com.trendyol.codecase.model.Category;
import com.trendyol.codecase.model.Product;
import com.trendyol.codecase.model.ShoppingCartItem;
import com.trendyol.codecase.service.EventService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(value = "/entrance", method = RequestMethod.GET)
    public ModelAndView entrance() {
        return new ModelAndView("entrance");
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ModelAndView setCategory() {
        return new ModelAndView("category", "category", new Category());
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String saveCategory(@ModelAttribute("category") @Valid Category category, BindingResult result, Model model) {
        model.addAttribute("category", category);

        if (result.hasErrors()) {
            return "category";
        }

        eventService.saveCategory(category);
        return "entrance";
    }


    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public ModelAndView setProduct() {
        return new ModelAndView("product", "product", new Product());
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String saveProduct(@ModelAttribute("product") @Valid Product product, BindingResult result, Model model) {
        model.addAttribute("product", product);

        if (result.hasErrors()) {
            return "product";
        }

        eventService.saveProduct(product);
        return "entrance";
    }

    @RequestMapping(value = "/productList", method = RequestMethod.GET)
    public ModelAndView showAllProduct() {
        return new ModelAndView("productList", "productList", eventService.showProduct());
    }


    @RequestMapping(value = "/campaign", method = RequestMethod.GET)
    public ModelAndView setCampaign() {
        return new ModelAndView("campaign", "campaign", new Campaign());
    }

    @RequestMapping(value = "/campaign", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String saveCampaign(@ModelAttribute("campaign") @Valid Campaign campaign, BindingResult result, Model model) {
        model.addAttribute("campaign", campaign);

        if (result.hasErrors()) {
            return "campaign";
        }

        eventService.saveCampaign(campaign);
        return "entrance";
    }

    @RequestMapping(value = "/shoppingCartItem", method = RequestMethod.GET)
    public ModelAndView setShoppingCartItem() {
        return new ModelAndView("shoppingCartItem", "shoppingCartItem", new ShoppingCartItem());
    }

    @RequestMapping(value = "/shoppingCartItem", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String saveShoppingCartItem(@ModelAttribute("shoppingCartItem") @Valid ShoppingCartItem shoppingCartItem, BindingResult result, Model model) {
        model.addAttribute("shoppingCartItem", shoppingCartItem);

        if (result.hasErrors()) {
            return "shoppingCartItem";
        }

        eventService.saveShoppingCartItem(shoppingCartItem);
        return "entrance";
    }

}
