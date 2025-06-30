package Creational.factory;

public class Main{
    public static void main(String[] args) {
        Product clothingProduct = ProductFactory.createProduct("Clothing", "T-Shirt", 1250.0, "M");
        Product electronicsProduct = ProductFactory.createProduct("Electronics", "Smartphone", 15999.0, "2");
        Product bookProduct = ProductFactory.createProduct("Book", "JavaScript Guide", 400.0, "Shresty");

        System.out.println(clothingProduct.getDetails());
        System.out.println(electronicsProduct.getDetails());
        System.out.println(bookProduct.getDetails());
    }
}
