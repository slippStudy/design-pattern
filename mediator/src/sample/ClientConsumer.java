package sample;

public class ClientConsumer implements Consumer {

    @Override
    public void receiveEvent(String from, String event) {
        System.out.println("ClientConsumer received from " + from + " and eventName is " + event);
    }
}
