package sample;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Producer goProducer = new GoProducer();
        Producer systemProducer = new SystemProducer();

        goProducer.setMediator(mediator);
        systemProducer.setMediator(mediator);

        // 구독 / 해지 // 구조 / 행위

        Consumer logConsumer = new LogConsumer();
        Consumer clientConsumer = new ClientConsumer();
        mediator.registerEvent(logConsumer);
        mediator.registerEvent(clientConsumer);
        mediator.registerEvent((from, event) -> {

        });

        mediator.unRegisterEvent(logConsumer);

        goProducer.eventOccurred("goProducer");
        systemProducer.eventOccurred("SystemProducer");

    }
}
