package structural.proxy;

public class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage;
    
    public ProxyImage(String filename) {
        this.filename = filename;
        // Note: RealImage is NOT created here - this is the key to lazy loading
    }
    
    @Override
    public void display() {
        // Lazy loading: only create RealImage when actually needed
        if (realImage == null) {
            System.out.println("Creating proxy for: " + filename);
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
    
    @Override
    public String getFilename() {
        return filename;
    }
    
   
    public boolean isLoaded() {
        return realImage != null;
    }
} 