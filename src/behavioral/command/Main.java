package behavioral.command;

public class Main {
    public static void main(String[] args) {
        // Create devices
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        
        // Create commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        
        // Create remote control
        RemoteControl remote = new RemoteControl();
        
        // Set up remote
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        
        // Use remote
        System.out.println("Smart Home Remote Control\n");
        
        remote.onButtonPressed(0);  // Turn on living room light
        remote.onButtonPressed(1);  // Turn on kitchen light
        remote.offButtonPressed(0); // Turn off living room light
        remote.undoButtonPressed(); // Undo last command
    }
} 