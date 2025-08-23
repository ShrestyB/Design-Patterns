package creational.builder;

import java.util.Collections;
import java.util.List;

public class Checkout {
    private final List<String> cartItems;
    private final String shippingAddress;
    private final String paymentMethod;
    private final String discountCode;

    private Checkout(CheckoutBuilder builder) {
        this.cartItems = Collections.unmodifiableList(builder.cartItems);
        this.shippingAddress = builder.shippingAddress;
        this.paymentMethod = builder.paymentMethod;
        this.discountCode = builder.discountCode;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart Items: ");
        if (cartItems == null || cartItems.isEmpty()) {
            sb.append("No items in cart");
        } else {
            sb.append(String.join(", ", cartItems));
        }
        sb.append("\nShipping Address: ").append(shippingAddress);
        sb.append("\nPayment Method: ").append(paymentMethod);
        sb.append("\n");
        sb.append(discountCode != null ? "Discount Code: " + discountCode : "No Discount Applied");
        return sb.toString();
    }

    public static class CheckoutBuilder {
        private List<String> cartItems;
        private String shippingAddress;
        private String paymentMethod;
        private String discountCode; // Optional

        public CheckoutBuilder(List<String> cartItems, String shippingAddress) {
            this.cartItems = cartItems;
            this.shippingAddress = shippingAddress;
        }

        public CheckoutBuilder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public CheckoutBuilder setDiscountCode(String discountCode) {
            this.discountCode = discountCode;
            return this;
        }

        public Checkout build() {
            if (cartItems == null || cartItems.isEmpty()) {
                throw new IllegalStateException("Cart must have at least one item.");
            }
            if (shippingAddress == null || shippingAddress.trim().isEmpty()) {
                throw new IllegalStateException("Shipping address is required.");
            }
            if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
                throw new IllegalStateException("Payment method is required.");
            }
            return new Checkout(this);
        }
    }
}
