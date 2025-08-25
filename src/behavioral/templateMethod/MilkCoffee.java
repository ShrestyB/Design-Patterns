package behavioral.templateMethod;

public class MilkCoffee extends CoffeeTemplate {
    
    @Override
    protected void brewCoffee() {
        System.out.println("Brewing coffee with milk");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar");
    }
} 