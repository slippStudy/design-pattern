package bridge;

public class ModemClients {
    public static void main(String[] args) {
        Modem modem = new DedModemController(new UsRoboticsModem());

        modem.receive();
        modem.send();

    }
}
