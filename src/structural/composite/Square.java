package structural.composite;

public class Square implements Shape {
    private double side;
    private String color;
    
    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " square with side length " + side);
    }
} 