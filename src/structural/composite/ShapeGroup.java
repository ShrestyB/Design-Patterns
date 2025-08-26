package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape {
    private String name;
    private List<Shape> shapes = new ArrayList<>();
    
    public ShapeGroup(String name) {
        this.name = name;
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }
    
    @Override
    public void draw() {
        System.out.println("=== Drawing Group: " + name + " ===");
        for (Shape shape : shapes) {
            shape.draw(); // This works for both individual shapes AND other groups!
        }
        System.out.println("=== Finished Group: " + name + " ===");
    }
} 