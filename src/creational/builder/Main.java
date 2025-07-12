package creational.builder;

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout.CheckoutBuilder("Laptop, Headphones", "123 Street, NY")
                .setPaymentMethod("Credit Card")
                .setDiscountCode("DISCOUNT10")
                .build();

        System.out.println(checkout.getDetails());

        System.out.println("\n--- Another Checkout ---\n");

        Checkout checkout2 = new Checkout.CheckoutBuilder("Smartphone", "456 Avenue, LA")
                .setPaymentMethod("PayPal")
                .build();

        System.out.println(checkout2.getDetails());
    }
}