package _3.undowithstate;

public class RemoteControlWithUndo {

    private Command command;

    public RemoteControlWithUndo() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press(){
        this.command.execute();
    }

    public void undo(){
        this.command.undo();
    }
}
