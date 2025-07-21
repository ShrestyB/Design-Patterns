package creational.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductFactory factory = new ProductFactory();

        for (ProductType type : ProductType.values()) {
            System.out.println("- " + type.name().toLowerCase());
        }
        System.out.print("Choose product type from above : ");
        String typeInput = scanner.nextLine().trim().toUpperCase();

        ProductType type = null;
        try {
            type = ProductType.valueOf(typeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid product type. Please choose from the available options.");
            scanner.close();
            return;
        }

        System.out.print("Enter product name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Product name cannot be empty");
            scanner.close();
            return;
        }

        System.out.print("Enter product price: ");
        double price;
        try {
            price = Double.parseDouble(scanner.nextLine().trim());
            if (price < 0) {
                System.out.println("Price cannot be negative");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format. Please enter a valid number.");
            scanner.close();
            return;
        }

        String additionalPrompt;
        switch (type) {
            case ELECTRONICS:
                additionalPrompt = "Enter warranty (years): ";
                break;
            case CLOTHING:
                additionalPrompt = "Enter size: ";
                break;
            case BOOK:
                additionalPrompt = "Enter author: ";
                break;
            default:
                System.out.println("Unknown product type");
                scanner.close();
                return;
        }
        System.out.print(additionalPrompt);
        String additionalDetail = scanner.nextLine().trim();

        try {
            Product product = factory.createProduct(type, name, price, additionalDetail);
            System.out.println("Product Details: " + product.getDetails());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
