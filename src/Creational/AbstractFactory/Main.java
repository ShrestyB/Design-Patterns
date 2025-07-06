package Creational.AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose store type (electronics/clothing/book): ");
        String storeType = scanner.nextLine().trim().toLowerCase();

        StoreFactory factory;
        switch (storeType) {
            case "electronics":
                factory = new ElectronicsStoreFactory();
                break;
            case "clothing":
                factory = new ClothingStoreFactory();
                break;
            case "book":
                factory = new BookStoreFactory();
                break;
            default:
                System.out.println("Invalid store type.");
                scanner.close();
                return;
        }

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = Double.parseDouble(scanner.nextLine());

        String extraPrompt;
        if (factory instanceof ElectronicsStoreFactory) {
            extraPrompt = "Enter warranty (years): ";
        } else if (factory instanceof ClothingStoreFactory) {
            extraPrompt = "Enter size: ";
        } else {
            extraPrompt = "Enter author: ";
        }
        System.out.print(extraPrompt);
        String extraInfo = scanner.nextLine();

        Product product = factory.createProduct(name, price, extraInfo);
        System.out.println("Product Details: " + product.getDetails());

        scanner.close();
    }
}
