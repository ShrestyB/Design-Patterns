package Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Product originalProduct = new Product("Laptop", 1200.0, "Electronics");
        System.out.println("Original: " + originalProduct.getDetails());

        Product clonedProduct = originalProduct.cloneProduct();
        clonedProduct.setName("Gaming Laptop"); // Changing name while keeping other attributes

        System.out.println("Cloned: " + clonedProduct.getDetails());
    }
}