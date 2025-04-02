package org.lexicon.model;

public class VendingMachineImpl implements IVendingMachine{

    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products, int depositPool) {
        this.products = products;
        this.depositPool = depositPool;
    }

    public int getDepositPool() {
        return depositPool;
    }

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }

    @Override
    public void addCurrency(double amount) {

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public Product request(int id) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(String id) {
        return "";
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }

    public void VendingMachineImpl(Product[] products){
        System.out.println();
    }


}
