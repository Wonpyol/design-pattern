package behavioral.strategy.recactoring;

public class Robot2 {
    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public Robot2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void attack() {
        attackStrategy.attack();
    }
    public void move() {
        movingStrategy.move();
    }
    //집약 관계
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
}
