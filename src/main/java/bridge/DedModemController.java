package bridge;

public class DedModemController extends ModemConnectionController {
    public DedModemController(ModemImplementation modemImplementation) {
        super(modemImplementation);
    }

    @Override
    protected void dialImpl(char[] a) {
        System.out.println("DedModem DialImpl");
//        super.dialImpl(a);
    }

    @Override
    protected void hangImpl() {
        System.out.println("DedModem hangImpl");
    }

    @Override
    protected void sendImpl() {
//        super.sendImpl();
    }

    @Override
    protected void receiveImpl() {
//        super.receiveImpl();
    }
}
