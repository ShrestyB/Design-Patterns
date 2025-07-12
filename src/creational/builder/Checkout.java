package creational.builder;

public class Checkout {
    private String cartItems;
    private String shippingAddress;
    private String paymentMethod;
    private String discountCode;

    private Checkout(CheckoutBuilder builder) {
        this.cartItems = builder.cartItems;
        this.shippingAddress = builder.shippingAddress;
        this.paymentMethod = builder.paymentMethod;
        this.discountCode = builder.discountCode;
    }

    public String getDetails() {
        return "Cart Items: " + cartItems + "\n" +
                "Shipping Address: " + shippingAddress + "\n" +
                "Payment Method: " + paymentMethod + "\n" +
                (discountCode != null ? "Discount Code: " + discountCode : "No Discount Applied");
    }

    public static class CheckoutBuilder {
        private String cartItems;
        private String shippingAddress;
        private String paymentMethod;
        private String discountCode; // Optional

        public CheckoutBuilder(String cartItems, String shippingAddress) {
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
            return new Checkout(this);
        }
    }
}
