package _4.undowithstatehistory;

import java.util.LinkedList;
import java.util.List;

public class RemoteControlWithUndo {

    private final List<Command> commands = new LinkedList<>();
    private int cursor = 0;


    public RemoteControlWithUndo() {
    }

    public void setCommand(Command command) {
        for (int i = commands.size() - 1; i > cursor; i--) {
            commands.remove(i);
        }
        commands.add(command);
        cursor = commands.size() - 1;
    }

    public void press() {
        this.commands.get(cursor).execute();
    }

    public void undo() {
        if (cursor < 0) return;
        Command command = commands.get(cursor--);
        command.execute();
    }
}
