package sample;

public class LogConsumer implements Consumer {

    @Override
    public void receiveEvent(String from, String event) {
        System.out.println("LogConsumer received from " + from + " and eventName is" + event);
    }
}
