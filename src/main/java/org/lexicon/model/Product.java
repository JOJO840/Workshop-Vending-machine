package org.lexicon.model;

public abstract class Product {  //Parent class
    private final int id;
    private double price;
    private String productName;

    public Product(int id, double price, String productName) {
        this.id = id;
        setProductName(productName);
        setPrice(price);
    }

    public int getId() {
        return id;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    abstract String examine();

    abstract String use();
}
