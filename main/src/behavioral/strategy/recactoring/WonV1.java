package behavioral.strategy.recactoring;

public class WonV1 extends Robot2 {
    public WonV1(String name) { super(name); }
    public void attack() { System.out.println("I have Missile."); }
    public void move() { System.out.println("I can only walk."); }
}
