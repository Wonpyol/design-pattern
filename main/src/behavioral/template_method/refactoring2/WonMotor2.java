package behavioral.template_method.refactoring2;

import behavioral.template_method.Door;
import behavioral.template_method.Enumeration;

public class WonMotor2 extends Motor2 {
    public WonMotor2(Door door) {
        super(door);
    }
    protected void moveMotor(Enumeration.Direction direction) {
        System.out.println("won motor");
    }
}