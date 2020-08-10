package net.slipp.design.pattern.command;

import org.springframework.stereotype.Component;

/**
 * 구체적인 명령어(증가)
 */
@Component
public class ConcreteIncreaseCommand implements Command {

    private final Receiver receiver;

    public ConcreteIncreaseCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.increase();
    }
}
