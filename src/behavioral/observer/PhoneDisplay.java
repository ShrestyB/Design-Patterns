package behavioral.observer;

public class PhoneDisplay implements WeatherObserver {
    private String name;
    
    public PhoneDisplay(String name) {
        this.name = name;
    }
    
    @Override
    public void update(int temperature, int humidity, int pressure) {
        System.out.println(name + " Phone Display:");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + " hPa\n");
    }
} 