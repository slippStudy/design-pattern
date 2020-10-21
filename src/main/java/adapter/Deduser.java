package adapter;

public class Deduser {
    private DedicatedModem modem = new DedicatedModem();

    public void messageProcess() {
        this.modem.send();
        this.modem.receive();
    }
}
