package sample;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Producer goProducer = new GoProducer();
        goProducer.setMediator(mediator);
        Producer systemProducer = new SystemProducer();
        systemProducer.setMediator(mediator);

        LogConsumer logConsumer = new LogConsumer();
        ClientConsumer clientConsumer = new ClientConsumer();
        mediator.registerEvent(logConsumer);
        mediator.registerEvent(clientConsumer);

        goProducer.eventOccurred("goProducer");
        systemProducer.eventOccurred("SystemProducer");

    }
}
