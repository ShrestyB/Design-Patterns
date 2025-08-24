package structural.flyweight;

public class Character {
    private final char value;
    private final CharacterStyle style;
    
    public Character(char value, CharacterStyle style) {
        this.value = value;
        this.style = style;
    }
    
    public void display() {
        style.applyStyle(value);
    }
    
    public char getValue() {
        return value;
    }
    
    public CharacterStyle getStyle() {
        return style;
    }
} 