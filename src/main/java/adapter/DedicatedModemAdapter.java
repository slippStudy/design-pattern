package adapter;

public class DedicatedModemAdapter implements Modem {
    DedicatedModem dedicatedModem;

    @Override
    public void dial(char[] a) {

    }

    @Override
    public void hangup() {

    }

    @Override
    public void send() {
        dedicatedModem.send();
    }

    @Override
    public void receive() {
        dedicatedModem.receive();
    }
}
