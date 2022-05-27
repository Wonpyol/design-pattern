package structure.composite.refactoring;

public class Keyboard1 extends ComputerDevice{
    private int price;
    private int power;
    public Keyboard1(int power, int price) {
        this.power = power;
        this.price = price;
    }
    public int getPrice() { return price; }
    public int getPower() { return power; }
}
