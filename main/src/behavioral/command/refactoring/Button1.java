package behavioral.command.refactoring;

public class Button1 {
    private Command theCommand;
    public Button1(Command theCommand){
        setCommand(theCommand);
    }
    public void setCommand(Command newCommand){
        this.theCommand = newCommand;
    }
    public void pressed(){
        theCommand.execute();
    }
}
