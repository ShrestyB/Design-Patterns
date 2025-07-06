package creational.abstractFactory;

class ElectronicsStoreFactory implements StoreFactory {
    @Override
    public Product createProduct(String name, double price, String extraInfo) {
        return new Electronics(name, price, Integer.parseInt(extraInfo)); // extraInfo is warranty
    }
}