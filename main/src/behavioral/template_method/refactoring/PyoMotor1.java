package behavioral.template_method.refactoring;

import behavioral.template_method.Door;
import behavioral.template_method.Enumeration;

public class PyoMotor1 extends Motor{
    public PyoMotor1(Door door) {
        super(door);
    }

    private void movePyoMotor(Enumeration.Direction direction) {
        //표 모터 작동
    }
    public void move(Enumeration.Direction direction) {
        Enumeration.MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == Enumeration.MotorStatus.MOVING) return;
        Enumeration.DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == Enumeration.DoorStatus.OPENED) door.close();
        movePyoMotor(direction);
        setMotorStatus(Enumeration.MotorStatus.MOVING);
    }
}