package behavioral.command.refactoring;

public class LampOnCommand implements Command {
    private Lamp1 theLamp;
    public LampOnCommand(Lamp1 theLamp){
        this.theLamp = theLamp;
    }
    @Override
    public void execute() {
        theLamp.turnOn();
    }
}
