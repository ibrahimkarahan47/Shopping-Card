package com.trendyol.codecase.entity;

import javax.persistence.*;

@Entity
@Table(name = "Category_info")
public class CategoryInfo {

    @Id
    @GeneratedValue
    private int id;
    private String title;

    @Basic
    @Column
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
