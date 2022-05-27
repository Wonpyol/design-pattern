package structure.composite.refactoring;

public class Client1 {
    public static void main(String[] args) {
        Keyboard1 keyboard1 = new Keyboard1(5, 2);
        Body1 body1 = new Body1(100, 70);
        Monitor1 monitor1 = new Monitor1(20, 30);

        Computer1 computer1 = new Computer1();
        computer1.addComponent(keyboard1);
        computer1.addComponent(body1);
        computer1.addComponent(monitor1);

        int computerPrice = computer1.getPrice();
        int computerPower = computer1.getPower();
        System.out.println("Computer Price: " + computerPrice + "만원");
        System.out.println("Computer Power: " + computerPower + "W");
    }
}
