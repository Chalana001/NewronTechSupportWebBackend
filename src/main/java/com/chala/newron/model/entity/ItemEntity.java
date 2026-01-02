package com.chala.newron.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Items")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_code", nullable = false, unique = true)
    private Integer itemCode;
    private String name;

    public ItemEntity() {

    }

    public Integer getItemCode() {
        return itemCode;
    }

    public void setItemCode(Integer itemCode) {
        this.itemCode = itemCode;
    }

    public ItemEntity(Long id, Integer itemCode, String name, String description, String category, String brand, String imgUrl, double price) {
        this.id = id;
        this.itemCode = itemCode;
        this.name = name;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.imgUrl = imgUrl;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    private String description;
    private String category;
    private String brand;
    private double price;
    private String imgUrl;
}
