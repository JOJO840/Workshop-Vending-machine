package org.lexicon.model;

public class Soda extends Product{
    public Soda(int id, double price, String productName) {
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
