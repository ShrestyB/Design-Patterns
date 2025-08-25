package behavioral.templateMethod;

public class BlackCoffee extends CoffeeTemplate {
    
    @Override
    protected void brewCoffee() {
        System.out.println("Brewing black coffee");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("No condiments added");
    }
} 