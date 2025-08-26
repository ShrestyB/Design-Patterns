package structural.proxy;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===\n");
        
        // Example 1: Using RealImage directly (expensive - loads immediately)
        System.out.println("1. Creating RealImage directly (loads immediately):");
        Image realImage = new RealImage("photo1.jpg");
        System.out.println("RealImage created and loaded!");
        
        // Example 2: Using ProxyImage (lazy loading - only loads when needed)
        System.out.println("\n2. Creating ProxyImage (lazy loading):");
        Image proxyImage = new ProxyImage("photo2.jpg");
        System.out.println("ProxyImage created (no loading yet)!");
        
        if (proxyImage instanceof ProxyImage) {
            ProxyImage proxy = (ProxyImage) proxyImage;
            System.out.println("Is real image loaded? " + proxy.isLoaded());
        }
        
        System.out.println("\n3. Displaying proxy image (triggers loading):");
        proxyImage.display();
        
     System.out.println("\n4. Displaying proxy image again (no loading):");
        proxyImage.display();
                System.out.println("\n5. Creating multiple proxy images:");
        Image[] images = {
            new ProxyImage("vacation1.jpg"),
            new ProxyImage("vacation2.jpg"),
            new ProxyImage("vacation3.jpg")
        };
        
        System.out.println("All proxy images created (no loading yet)!");
        
        System.out.println("\n6. Displaying only the first image:");
        images[0].display();
        
        System.out.println("\n=== Key Benefits ===");
        System.out.println("✓ Lazy Loading: Images only load when actually needed");
        System.out.println("✓ Memory Efficiency: Only load images that are used");
        System.out.println("✓ Performance: Fast startup, loading on demand");
        System.out.println("✓ Same Interface: Proxy and Real objects are interchangeable");
    }
} 