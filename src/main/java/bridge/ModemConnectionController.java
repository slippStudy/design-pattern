package bridge;

public abstract class ModemConnectionController implements Modem, DedicatedModem {
    ModemImplementation modemImplementation;

    public ModemConnectionController(ModemImplementation modemImplementation) {
        this.modemImplementation = modemImplementation;
    }

    protected void dialImpl(char[] a) {
        modemImplementation.dial(a);
    }

    protected void hangImpl() {
        modemImplementation.hangup();
    }

    protected void sendImpl() {
        modemImplementation.send();
    }

    protected void receiveImpl() {
        modemImplementation.receive();;
    }

    @Override
    public void dial(char[] a) {
        this.dialImpl(a);
    }

    @Override
    public void hangup() {
        this.hangImpl();
    }

    @Override
    public void send() {
        this.sendImpl();
    }

    @Override
    public void receive() {
        this.receiveImpl();
    }
}
