package com.trendyol.codecase.service;

import com.trendyol.codecase.entity.CampaignInfo;
import com.trendyol.codecase.entity.CategoryInfo;
import com.trendyol.codecase.entity.ProductInfo;
import com.trendyol.codecase.model.*;
import com.trendyol.codecase.repo.CampaignInfoRepository;
import com.trendyol.codecase.repo.CategoryInfoRepository;
import com.trendyol.codecase.repo.ProductInfoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EventService {
    private final CategoryInfoRepository categoryInfoRepository;
    private final ProductInfoRepository productInfoRepository;
    private final CampaignInfoRepository campaignInfoRepository;
    private CategoryInfo categoryInfo = new CategoryInfo();
    private ProductInfo productInfo = new ProductInfo();
    private CampaignInfo campaignInfo = new CampaignInfo();


    public EventService(CategoryInfoRepository categoryInfoRepository, ProductInfoRepository productInfoRepository, CampaignInfoRepository campaignInfoRepository) {
        this.categoryInfoRepository = categoryInfoRepository;
        this.productInfoRepository = productInfoRepository;
        this.campaignInfoRepository = campaignInfoRepository;
    }

    public void saveCategory(Category categoryObject){
        categoryInfo.setTitle(categoryObject.getTitle());
        categoryInfoRepository.save(categoryInfo);
    }

    public void saveProduct(Product productObject ){
        productInfo.setTitle(productObject.getTitle());
        productInfo.setPrice(productObject.getPrice());
        productInfo.setCategoryInfo(productObject.getCategory());
        productInfoRepository.save(productInfo);
    }

    public ArrayList<ProductInfo> showProduct(){
        Iterable<ProductInfo> productDbList = productInfoRepository.findAll();
        ArrayList<ProductInfo> productList = new ArrayList<>();

        for (ProductInfo element : productDbList) {
                ProductInfo productInfo = new ProductInfo();
                productInfo.setTitle(element.getTitle());
                productInfo.setPrice(element.getPrice());
                productInfo.setCategoryInfo(element.getCategoryInfo());
                productList.add(productInfo);
            }
        return productList;
    }

    public void saveCampaign(Campaign campaignObject){
        campaignInfo.setCategoryInfo(campaignObject.getCategoryInfo());
        campaignInfo.setDiscountAmount(campaignObject.getDiscountAmount());
        campaignInfo.setProductQuantity(campaignObject.getProductQuantity());
        campaignInfo.setType(campaignObject.getType());
        campaignInfoRepository.save(campaignInfo);
    }

    public void saveShoppingCartItem(ShoppingCartItem shoppingCartItem){
        Product product = new Product();
        ShoppingCart shoppingCart = new ShoppingCart();
        ArrayList<ProductInfo> productList = new ArrayList<>();
        productList = showProduct();
        for (ProductInfo element:productList){
            if(element.getTitle().equals(shoppingCartItem.getProductTitle())){
                product.setTitle(element.getTitle());
                product.setPrice(element.getPrice());
                product.setCategory(element.getCategoryInfo());
                break;
            }
        }
        shoppingCart.addItem(product,shoppingCartItem.getQuantity());
    }

}
