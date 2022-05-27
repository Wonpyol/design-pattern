package behavioral.strategy.recactoring;

public class Client {
    public static void main(String[] args){
        Robot2 wonV = new WonV1("wonV1");
        Robot2 pyoV = new PyoV1("pyoV1");
        wonV.setMovingStrategy(new WalkingStrategy());
        wonV.setAttackStrategy(new MissileStrategy());
        pyoV.setMovingStrategy(new FlyingStrategy());
        pyoV.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + wonV.getName());
        wonV.move();
        wonV.attack();

        System.out.println("My name is " + pyoV.getName());
        pyoV.move();
        pyoV.attack();
    }
}
