package org.lexicon.model;

public class Snacks extends Product{
    public Snacks(int id, double price, String productName) {
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
