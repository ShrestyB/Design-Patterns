package structural.composite;

public class Main {
    public static void main(String[] args) {
        // Create individual shapes
        Shape redCircle = new Circle(5, "red");
        Shape blueSquare = new Square(4, "blue");
        
        // Create a group and add shapes to it
        ShapeGroup group = new ShapeGroup("My Shapes");
        group.addShape(redCircle);
        group.addShape(blueSquare);
        
        // Draw the group (which draws all shapes inside it)
        System.out.println("Drawing all shapes in group:");
        group.draw();
        
        // You can also draw individual shapes
        System.out.println("\nDrawing individual shapes:");
        redCircle.draw();
        blueSquare.draw();
    }
}
