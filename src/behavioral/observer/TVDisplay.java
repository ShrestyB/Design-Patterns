package behavioral.observer;

public class TVDisplay implements WeatherObserver {
    private String location;
    
    public TVDisplay(String location) {
        this.location = location;
    }
    
    @Override
    public void update(int temperature, int humidity, int pressure) {
        System.out.println(location + " TV Display:");
        System.out.println("Current Weather: " + temperature + "°C, " + humidity + "% humidity");
        System.out.println("Atmospheric Pressure: " + pressure + " hPa\n");
    }
} 