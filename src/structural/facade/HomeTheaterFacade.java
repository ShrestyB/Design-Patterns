package structural.facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;
    
    public HomeTheaterFacade() {
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DvdPlayer();
        this.projector = new Projector();
        this.lights = new Lights();
    }
    
    public void watchMovie(String movie) {
        System.out.println("Starting Movie Mode");
        lights.dim();
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(8);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
    
    public void endMovie() {
        System.out.println("Ending Movie Mode");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        lights.on();
    }
} 