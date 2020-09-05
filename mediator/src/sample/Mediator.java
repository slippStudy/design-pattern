package sample;

import java.util.LinkedList;
import java.util.List;

public class Mediator {

    List<Consumer> consumers = new LinkedList<>();

    public void registerEvent(Consumer consumer) {
        consumers.add(consumer);
    }

    public void onEvent(String from, String event) {
        for (Consumer consumer : consumers)
            consumer.receiveEvent(from, event);
    }

    public void unRegisterEvent(Consumer logConsumer) {
        consumers.remove(logConsumer);
    }
}
