package structural.facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Without Facade Pattern");
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        
        lights.dim();
        projector.on();
        projector.setInput("DVD");
        amp.on();
        amp.setVolume(8);
        dvd.on();
        dvd.play("The Matrix");
        
        System.out.println("\nWith Facade Pattern");
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        
        homeTheater.watchMovie("The Matrix");
        
        System.out.println("\nEnding Movie");
        homeTheater.endMovie();
    }
} 