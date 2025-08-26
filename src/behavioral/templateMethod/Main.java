package behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Coffee Making Process\n");
        
        CoffeeTemplate blackCoffee = new BlackCoffee();
        blackCoffee.makeCoffee();
        
        CoffeeTemplate milkCoffee = new MilkCoffee();
        milkCoffee.makeCoffee();
    }
} 