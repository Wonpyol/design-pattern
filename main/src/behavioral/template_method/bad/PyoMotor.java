package behavioral.template_method.bad;

import behavioral.template_method.Door;

import static behavioral.template_method.Enumeration.*;

public class PyoMotor {
    private Door door;
    private MotorStatus motorStatus;

    public PyoMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    private void movePyoMotor(Direction direction) {
        //표 모터 작동
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;
        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) door.close();
        movePyoMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}