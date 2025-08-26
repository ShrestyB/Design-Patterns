package behavioral.chainOfResponsibility;

public class Level1Support extends AbstractSupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.toLowerCase().contains("password") || request.toLowerCase().contains("login")) {
            System.out.println("Level 1 Support: Resetting password for you");
        } else {
            super.handleRequest(request);
        }
    }
} 