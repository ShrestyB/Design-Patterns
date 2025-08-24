package structural.proxy;

public class RealImage implements Image {
    private final String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filename);
        // Simulate loading time
        try {
            Thread.sleep(2000); // Simulate 2 seconds of loading time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Loading interrupted");
        }
        System.out.println("Image loaded successfully: " + filename);
    }
    
    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
    
    @Override
    public String getFilename() {
        return filename;
    }
} 