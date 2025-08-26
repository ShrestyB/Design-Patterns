package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class StyleFactory {
    private static final Map<String, CharacterStyle> styleCache = new HashMap<>();
    
    public static CharacterStyle getStyle(String font, int size, String color) {
        String key = font + "_" + size + "_" + color;
        
        if (!styleCache.containsKey(key)) {
            System.out.println("Creating new style: " + font + ", " + size + "pt, " + color);
            styleCache.put(key, new CharacterStyle(font, size, color));
        } else {
            System.out.println("Reusing existing style: " + font + ", " + size + "pt, " + color);
        }
        
        return styleCache.get(key);
    }
    
    public static int getCacheSize() {
        return styleCache.size();
    }
    
    public static void clearCache() {
        styleCache.clear();
    }
} 