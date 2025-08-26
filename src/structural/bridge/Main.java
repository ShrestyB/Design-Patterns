package structural.bridge;

public class Main {
    public static void main(String[] args) {
        // Create different drawing implementations
        DrawAPI redDrawer = new RedCircle();
        DrawAPI greenDrawer = new GreenCircle();
        
        // Create shapes with different implementations
        Shape redCircle = new Circle(100, 100, 10, redDrawer);
        Shape greenCircle = new Circle(100, 100, 10, greenDrawer);
        Shape redSquare = new Square(100, 100, 10, redDrawer);
        Shape greenSquare = new Square(100, 100, 10, greenDrawer);
        
        // Draw shapes
        redCircle.draw();
        greenCircle.draw();
        redSquare.draw();
        greenSquare.draw();
    }
} 