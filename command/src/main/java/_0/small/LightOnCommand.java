package _0.small;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on(); //리시버 객체에 있는 on()메소드를 호출
    }
}
