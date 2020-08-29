package sample;

import java.util.Objects;

public class GoProducer implements Producer {

    private Mediator mediator;

    public GoProducer() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        Objects.requireNonNull(mediator, "Mediator is Null");
        this.mediator = mediator;
    }

    @Override
    public void eventOccurred(String eventName) {
        Objects.requireNonNull(mediator, "Mediator is Null");
        mediator.onEvent(this.getClass().getName(), eventName);
    }
}
