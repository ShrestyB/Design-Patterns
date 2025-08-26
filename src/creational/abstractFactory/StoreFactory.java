package creational.abstractFactory;
interface StoreFactory {
    Product createProduct(String name, double price, String additionalDetail);
}