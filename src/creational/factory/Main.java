package creational.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product type (CLOTHING, ELECTRONICS, BOOK):");
        String typeInput = scanner.nextLine().toUpperCase();
        ProductType type = ProductType.valueOf(typeInput);

        System.out.println("Enter product name:");
        String name = scanner.nextLine();

        System.out.println("Enter product price:");
        double price = Double.parseDouble(scanner.nextLine());

        String additionalDetail = "";
        switch (type) {
            case CLOTHING:
                System.out.println("Enter size:");
                additionalDetail = scanner.nextLine();
                break;
            case ELECTRONICS:
                System.out.println("Enter warranty (years):");
                additionalDetail = scanner.nextLine();
                break;
            case BOOK:
                System.out.println("Enter author:");
                additionalDetail = scanner.nextLine();
                break;
        }

        Product product = ProductFactory.createProduct(type, name, price, additionalDetail);
        System.out.println(product.getDetails());

        scanner.close();
    }
}
