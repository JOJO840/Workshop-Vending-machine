package org.lexicon.model;

public class Candy extends Product{
    public Candy(int id, double price, String productName) {
        super(id, price, productName);
    }

    @Override
    String examine() {
        return "";
    }

    @Override
    String use() {
        return "";
    }
}
