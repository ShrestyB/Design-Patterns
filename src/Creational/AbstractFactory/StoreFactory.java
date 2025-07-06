package Creational.AbstractFactory;


interface StoreFactory {
    Product createProduct(String name, double price, String extraInfo);
}