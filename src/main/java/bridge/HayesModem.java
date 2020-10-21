package bridge;

public class HayesModem implements ModemImplementation {
    @Override
    public void dial(char[] a) {
        System.out.println("hayes modem dial");
    }

    @Override
    public void hangup() {
        System.out.println("hayes modem hangup");
    }

    @Override
    public void send() {
        System.out.println("hayes modem send");
    }

    @Override
    public void receive() {
        System.out.println("hayes modem receive");
    }
}
