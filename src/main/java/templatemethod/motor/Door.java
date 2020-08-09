package templatemethod.motor;

public class Door {
    private DoorStatus doorStatus;

    public Door() {
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void open() {
        this.doorStatus = DoorStatus.OPEN;
    }

    public void close() {
        this.doorStatus = DoorStatus.CLOSE;
    }

    public enum DoorStatus {
        OPEN, CLOSE
    }
}


