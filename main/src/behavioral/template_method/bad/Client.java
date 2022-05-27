package behavioral.template_method.bad;

import behavioral.template_method.Door;
import behavioral.template_method.Enumeration;

public class Client {
    public static void main(String[] args){
        Door door = new Door();
        WonMotor wonMotor  = new WonMotor(door);
        wonMotor.move(Enumeration.Direction.UP);

    }
}
