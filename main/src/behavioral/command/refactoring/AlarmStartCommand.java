package behavioral.command.refactoring;

public class AlarmStartCommand implements Command{
    private Alarm1 theAlarm;
    public AlarmStartCommand(Alarm1 theAlarm){
        this.theAlarm = theAlarm;
    }
    @Override
    public void execute() {
        theAlarm.start();
    }
}
