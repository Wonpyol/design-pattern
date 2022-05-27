package creational.singleton;

public class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public void print(){
        Printer printer = Printer.getPrinter();
        printer.print("print gogo");
    }
}
