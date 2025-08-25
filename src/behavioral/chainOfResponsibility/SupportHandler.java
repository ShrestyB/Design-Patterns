package behavioral.chainOfResponsibility;

public interface SupportHandler {
    void setNext(SupportHandler next);
    void handleRequest(String request);
} 