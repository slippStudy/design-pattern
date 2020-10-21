package bridge;

public class ModemClients {
    public static void main(String[] args) {
        DedicatedModem dedicatedModem = new DedModemController(new UsRoboticsModem());

        dedicatedModem.receive();
        dedicatedModem.send();

        Modem modem = new DialModemController(new UsRoboticsModem());
//        modem.hangup();
//        modem.receive();
//        modem.send();
    }
}
