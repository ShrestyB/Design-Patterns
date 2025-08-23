package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Starting application", LogLevel.INFO);
        logger.log("Fetching user data", LogLevel.DEBUG);

        PaymentService paymentService = new PaymentService();
        paymentService.processPayment();

        logger.log("Application shutting down", LogLevel.INFO);
    }
}

