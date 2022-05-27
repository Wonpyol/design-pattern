package behavioral.strategy.bad;

public class Client {
    public static void main(String[] args) {
        Robot wonV = new WonV("wonV");
        Robot pyoV = new PyoV("pyoV");

        System.out.println("My name is " + wonV.getName());
        wonV.move();
        wonV.attack();
        System.out.println("My name is " + pyoV.getName());
        pyoV.move();
        pyoV.attack();
    }
}
