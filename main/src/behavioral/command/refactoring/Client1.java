package behavioral.command.refactoring;

public class Client1 {
    public static void main(String[] args){
        Lamp1 lamp = new Lamp1();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm1 alarm = new Alarm1();
        Command alarmStartCommand = new AlarmStartCommand(alarm);

        Button1 button = new Button1(lampOnCommand);
        button.pressed();

        Button1 button1 = new Button1(alarmStartCommand);
        button1.pressed();
        button1.setCommand(lampOnCommand);
        button1.pressed();
    }
}
