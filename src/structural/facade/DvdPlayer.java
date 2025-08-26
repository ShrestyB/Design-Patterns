package structural.facade;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player turned on");
    }
    
    public void play(String movie) {
        System.out.println("DVD Player playing: " + movie);
    }
    
    public void stop() {
        System.out.println("DVD Player stopped");
    }
    
    public void off() {
        System.out.println("DVD Player turned off");
    }
} 