package behavioral.chainOfResponsibility;

public class Level3Support extends AbstractSupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.toLowerCase().contains("bug") || request.toLowerCase().contains("crash")) {
            System.out.println("Level 3 Support: Escalating to development team");
        } else {
            System.out.println("Level 3 Support: Unable to help with this request");
        }
    }
} 