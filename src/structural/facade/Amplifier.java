package structural.facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier turned on");
    }
    
    public void setVolume(int level) {
        System.out.println("Amplifier volume set to " + level);
    }
    
    public void off() {
        System.out.println("Amplifier turned off");
    }
} 