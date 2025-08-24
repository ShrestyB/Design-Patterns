package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create characters with shared styles
        List<Character> document = new ArrayList<>();
        
        CharacterStyle redStyle = StyleFactory.getStyle("Arial", 12, "red");
        CharacterStyle blueStyle = StyleFactory.getStyle("Times", 14, "blue");
        
        // Add characters using shared styles
        document.add(new Character('H', redStyle));
        document.add(new Character('e', redStyle));
        document.add(new Character('l', redStyle));
        document.add(new Character('l', redStyle));
        document.add(new Character('o', redStyle));
        
        document.add(new Character('W', blueStyle));
        document.add(new Character('o', blueStyle));
        document.add(new Character('r', blueStyle));
        document.add(new Character('l', blueStyle));
        document.add(new Character('d', blueStyle));
        
        // Display all characters
        for (Character c : document) {
            c.display();
        }
        
        System.out.println("Characters: " + document.size());
        System.out.println("Styles: " + StyleFactory.getCacheSize());
    }
} 