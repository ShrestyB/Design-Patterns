package structural.flyweight;

/**
 * CharacterStyle - Flyweight class containing shared formatting properties
 * This represents the intrinsic (shared) state that can be reused
 */
public class CharacterStyle {
    private final String font;
    private final int size;
    private final String color;
    
    public CharacterStyle(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }
    
    public void applyStyle(char character) {
        System.out.println("Character '" + character + "' with style: " + 
                          font + ", " + size + "pt, " + color);
    }
    
    public String getFont() {
        return font;
    }
    
    public int getSize() {
        return size;
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CharacterStyle that = (CharacterStyle) obj;
        return size == that.size && 
               font.equals(that.font) && 
               color.equals(that.color);
    }
    
    @Override
    public int hashCode() {
        return font.hashCode() + 31 * size + 31 * 31 * color.hashCode();
    }
} 