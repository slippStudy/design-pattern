package _3.undowithstate;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan home = new CeilingFan("Home");
        remoteControl.setCommand(new CeilingFanHighCommand(home));

        remoteControl.press();
        remoteControl.setCommand(new CeilingFanLowCommand(home));
        remoteControl.press();
        remoteControl.undo();
    }

}
