enum DoorStatus {CLOSED, OPEND}
enum MotorStatus {MOVING, STOPPED}

public class Door {
    private DoorStatus doorStatus;

    public Door() {doorStatus = DoorStatus.CLOSED;}
    public DoorStatus getDoorStatus() {return doorStatus;}
    public void close() { doorStatus = DoorStatus.CLOSED;}
    public void open() {doorStatus = DoorStatus.OPEND;}

}

class HyundaiMotor {
    private Door door;
    private MotorStatus motorStatus;

    public HyundaiMotor() {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }
    public MotorStatus getMotorStatus() {return getMotorStatus();}
    private void setMotorStatus() {this.motorStatus = motorStatus;}

    public void move() {

    }

}
