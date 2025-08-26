package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Create the chain
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();
        
        // Set up the chain
        level1.setNext(level2);
        level2.setNext(level3);
        
        // Test different requests
        System.out.println("Customer Support System\n");
        
        level1.handleRequest("I forgot my password");
        level1.handleRequest("Database is not responding");
        level1.handleRequest("Application crashed");
        level1.handleRequest("How do I change my email?");
    }
} 