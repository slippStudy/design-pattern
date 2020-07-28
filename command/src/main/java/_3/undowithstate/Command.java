package _3.undowithstate;

public interface Command {
    void execute();
    void undo();
}
