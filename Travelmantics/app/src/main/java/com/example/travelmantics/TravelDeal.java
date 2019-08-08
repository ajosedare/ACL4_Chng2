package com.example.travelmantics;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private  String title;
    private  String description;
    private  String price;
    private  String imageUr;
    private String imageName;

    public TravelDeal(){}

    public TravelDeal(String title, String description, String price, String imageUr, String imageName) {
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);
        this.setPrice(price);
        this.setImageUr(imageUr);
        this.setImageName(imageName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUr() {
        return imageUr;
    }

    public void setImageUr(String imageUr) {
        this.imageUr = imageUr;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
