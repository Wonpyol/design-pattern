package behavioral.strategy.recactoring;

public class WalkingStrategy implements MovingStrategy {
    public void move() {
        System.out.println("I can only walk.");
    }
}
