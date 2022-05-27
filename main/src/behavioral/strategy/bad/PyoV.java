package behavioral.strategy.bad;

public class PyoV extends Robot{
    public PyoV(String name) { super(name); }
    public void attack() { System.out.println("I have Missile."); }
    public void move() { System.out.println("I can only walk."); }
}
