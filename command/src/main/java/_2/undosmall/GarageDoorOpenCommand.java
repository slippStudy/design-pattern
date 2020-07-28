package _2.undosmall;

public class GarageDoorOpenCommand implements Command {

    GarageDoor light;

    public GarageDoorOpenCommand(GarageDoor light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOff();
    }
}
