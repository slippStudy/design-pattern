package net.slipp.design.pattern.command;

import org.springframework.stereotype.Component;

/**
 * 구체적인 명령어(감소)
 */
@Component
public class ConcreteDecreaseCommand implements Command {

    private final Receiver receiver;

    public ConcreteDecreaseCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.decrease();
    }
}
