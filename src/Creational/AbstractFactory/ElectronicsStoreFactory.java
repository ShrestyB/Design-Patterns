package Creational.AbstractFactory;

class ElectronicsStoreFactory implements StoreFactory {
    @Override
    public Product createProduct(String name, double price, String extraInfo) {
        return new Electronics(name, price, Integer.parseInt(extraInfo)); // extraInfo is warranty
    }
}