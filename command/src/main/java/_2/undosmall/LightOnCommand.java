package _2.undosmall;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on(); //리시버 객체에 있는 on()메소드를 호출
    }

    @Override
    public void undo() {
        light.off();
    }
}
