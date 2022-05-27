package behavioral.strategy.bad;

public class WonV extends Robot{
    public WonV(String name) { super(name); }
    public void attack() { System.out.println("I have Missile."); }
    public void move() { System.out.println("I can only walk."); }
}
