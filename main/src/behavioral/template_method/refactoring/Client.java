package behavioral.template_method.refactoring;

import behavioral.template_method.Door;
import behavioral.template_method.Enumeration;

public class Client {
    public static void main(String[] args){
        Door door = new Door();
        WonMotor1 wonMotor1 = new WonMotor1(door);
        wonMotor1.move(Enumeration.Direction.UP);

    }
}
