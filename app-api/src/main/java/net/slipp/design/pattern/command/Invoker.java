package net.slipp.design.pattern.command;

/**
 * 기능의 실행을 요청하는 호출자
 */
public class Invoker {
    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
