package behavioral.template_method.refactoring;

import behavioral.template_method.Door;
import behavioral.template_method.Enumeration;

public abstract class Motor {
    protected Door door;
    private Enumeration.MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = Enumeration.MotorStatus.STOPPED;
    }

    public Enumeration.MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(Enumeration.MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
