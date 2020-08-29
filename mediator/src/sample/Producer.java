package sample;

public interface Producer {

    void setMediator(Mediator mediator);
    void eventOccurred(String eventName);
}
