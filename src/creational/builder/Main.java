package creational.builder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cart1 = Arrays.asList("Laptop", "Headphones");
        Checkout checkout = new Checkout.CheckoutBuilder(cart1, "123 Street, NY")
                .setPaymentMethod("Credit Card")
                .setDiscountCode("DISCOUNT10")
                .build();

        System.out.println(checkout.getDetails());

        System.out.println("\n--- Another Checkout ---\n");

        List<String> cart2 = Arrays.asList("Smartphone");
        Checkout checkout2 = new Checkout.CheckoutBuilder(cart2, "456 Avenue, LA")
                .setPaymentMethod("PayPal")
                .build();

        System.out.println(checkout2.getDetails());
    }
}