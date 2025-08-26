package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        
        PhoneDisplay phone1 = new PhoneDisplay("Shresty's");
        PhoneDisplay phone2 = new PhoneDisplay("Priyansh's");
        TVDisplay tv = new TVDisplay("Living Room");
        
        weatherStation.addObserver(phone1);
        weatherStation.addObserver(phone2);
        weatherStation.addObserver(tv);
        
        System.out.println("Weather Station\n");
        
        weatherStation.setMeasurements(25, 65, 1013);
        weatherStation.setMeasurements(28, 70, 1010);
        
        weatherStation.removeObserver(phone2);
        weatherStation.setMeasurements(22, 60, 1015);
    }
} 