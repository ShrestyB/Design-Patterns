package Creational.AbstractFactory;

class BookStoreFactory implements StoreFactory {
    @Override
    public Product createProduct(String name, double price, String extraInfo) {
        return new Book(name, price, extraInfo);

    }
}
