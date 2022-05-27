package behavioral.template_method.bad;

import behavioral.template_method.Door;

import static behavioral.template_method.Enumeration.*;

public class WonMotor {
    private Door door;
    private MotorStatus motorStatus;

    public WonMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    private void moveWonMotor(Direction direction) {
        //원 모터 작동
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
        moveWonMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}