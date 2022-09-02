package model;

import org.testng.Assert;

public class Product {
    private String title;
    private String description;
    private String price;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public void verifyProduct(Product expectedProduct){
        Assert.assertEquals(this.getTitle(), expectedProduct.getTitle());
        Assert.assertEquals(this.getDescription(), expectedProduct.getDescription());
        Assert.assertEquals(this.getPrice(), expectedProduct.getPrice());
    }
}
