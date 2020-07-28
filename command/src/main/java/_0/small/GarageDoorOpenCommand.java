package _0.small;

public class GarageDoorOpenCommand implements Command {

    GarageDoor light;

    public GarageDoorOpenCommand(GarageDoor light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
