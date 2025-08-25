package behavioral.command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand;
    
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonPressed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            lastCommand = onCommands[slot];
        }
    }
    
    public void offButtonPressed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            lastCommand = offCommands[slot];
        }
    }
    
    public void undoButtonPressed() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
} 