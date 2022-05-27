package behavioral.template_method.refactoring2;

import behavioral.template_method.Door;
import behavioral.template_method.Enumeration;

public class Client {
    public static void main(String[] args){
        Door door = new Door();
        WonMotor2 wonMotor2 = new WonMotor2(door);
        wonMotor2.move(Enumeration.Direction.UP);
    }
}
