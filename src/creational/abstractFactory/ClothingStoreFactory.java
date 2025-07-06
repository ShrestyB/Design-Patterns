package creational.abstractFactory;

class ClothingStoreFactory implements StoreFactory {
    @Override
    public Product createProduct(String name, double price, String extraInfo) {
        return new Clothing(name, price, extraInfo); // extraInfo is size
    }
}
