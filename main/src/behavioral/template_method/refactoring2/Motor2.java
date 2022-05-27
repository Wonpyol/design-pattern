package behavioral.template_method.refactoring2;

import behavioral.template_method.Door;
import behavioral.template_method.Enumeration.Direction;
import behavioral.template_method.Enumeration.DoorStatus;
import behavioral.template_method.Enumeration.MotorStatus;

public abstract class Motor2 {
    private Door door;
    private MotorStatus motorStatus;

    public Motor2(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    protected void moveMotor(Direction direction) {
        System.out.println("motor2");
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;
        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) door.close();
        moveMotor(direction); // (PyoMotor와 WonMotor에서 오버라이드 됨)
        setMotorStatus(MotorStatus.MOVING);
    }

}
