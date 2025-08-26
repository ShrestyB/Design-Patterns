package behavioral.templateMethod;

public abstract class CoffeeTemplate {
    
    public final void makeCoffee() {
        boilWater();
        brewCoffee();
        pourInCup();
        addCondiments();
        System.out.println("Coffee is ready!\n");
    }
    
    private void boilWater() {
        System.out.println("Boiling water");
    }
    
    protected abstract void brewCoffee();
    
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    protected abstract void addCondiments();
} 