package behavioral.strategy.recactoring;

public class PyoV1 extends Robot2 {
    public PyoV1(String name) { super(name); }
    public void attack() { System.out.println("I have Missile."); }
    public void move() { System.out.println("I can only walk."); }
}
