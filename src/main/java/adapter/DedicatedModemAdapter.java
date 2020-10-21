package adapter;

import bridge.Modem;

public class DedicatedModemAdapter implements Modem {
    private DedicatedModem dedicatedModem;

    public DedicatedModemAdapter(DedicatedModem delegateModem) {
        this.dedicatedModem = delegateModem;
    }

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
