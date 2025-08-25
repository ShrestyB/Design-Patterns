package behavioral.chainOfResponsibility;

public abstract class AbstractSupportHandler implements SupportHandler {
    protected SupportHandler nextHandler;
    
    @Override
    public void setNext(SupportHandler next) {
        this.nextHandler = next;
    }
    
    @Override
    public void handleRequest(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for: " + request);
        }
    }
} 