 package creational.abstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available store types:");
        for (ProductType type : ProductType.values()) {
            System.out.println("- " + type.getDisplayName().toLowerCase());
        }
        System.out.print("Choose store type: ");
        String storeTypeInput = scanner.nextLine().trim().toUpperCase();

        ProductType selectedType = null;
        try {
            selectedType = ProductType.valueOf(storeTypeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid store type. Please choose from the available options.");
            scanner.close();
            return;
        }

        StoreFactory factory;
        switch (selectedType) {
            case ELECTRONICS:
                factory = new ElectronicsStoreFactory();
                break;
            case CLOTHING:
                factory = new ClothingStoreFactory();
                break;
            case BOOK:
                factory = new BookStoreFactory();
                break;
            default:
                System.out.println("Invalid store type. Please choose from the available options.");
                scanner.close();
                return;
        }

        try {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Product name cannot be empty");
            }

            System.out.print("Enter product price: ");
            double price;
            try {
                price = Double.parseDouble(scanner.nextLine().trim());
                if (price < 0) {
                    throw new IllegalArgumentException("Price cannot be negative");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid price format. Please enter a valid number.");
            }

            String additionalPrompt;
            switch (selectedType) {
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
                    throw new IllegalArgumentException("Unknown product type");
            }
            
            System.out.print(additionalPrompt);
            String additionalDetail = scanner.nextLine().trim();

            Product product = factory.createProduct(name, price, additionalDetail);
            System.out.println("Product Details: " + product.getDetails());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
