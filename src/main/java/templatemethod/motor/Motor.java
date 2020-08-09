package templatemethod.motor;

public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    public Door getDoor() {
        return door;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        Motor.MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == Motor.MotorStatus.MOVING) return;

        Door.DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == Door.DoorStatus.OPEN) door.close();

        moveMotor(direction); // overriding each class

        setMotorStatus(Motor.MotorStatus.MOVING);
    } // template method

    protected abstract void moveMotor(Direction direction);

    public enum MotorStatus {
        MOVING, STOPPED
    }
}
