package behavioral.chainOfResponsibility;

public class Level2Support extends AbstractSupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.toLowerCase().contains("database") || request.toLowerCase().contains("server")) {
            System.out.println("Level 2 Support: Checking server logs for you");
        } else {
            super.handleRequest(request);
        }
    }
} 