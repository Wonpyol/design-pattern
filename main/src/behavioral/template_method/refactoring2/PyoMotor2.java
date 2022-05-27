package behavioral.template_method.refactoring2;

import behavioral.template_method.Door;
import static behavioral.template_method.Enumeration.*;

public class PyoMotor2 extends Motor2 {
    public PyoMotor2(Door door) {
        super(door);
    }
    @Override
    public void moveMotor(Direction direction) {
        System.out.println("pyo motor");
    }
}