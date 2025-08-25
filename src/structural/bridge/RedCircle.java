package structural.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Red Circle at (" + x + "," + y + ") with radius " + radius);
    }
    
    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing Red Square at (" + x + "," + y + ") with side " + side);
    }
} 