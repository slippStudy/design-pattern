package adapter;

import bridge.Modem;

public class ModemImplAdapter implements Modem {
    private ModemImpl modemImpl;

    public ModemImplAdapter(ModemImpl modemImpl) {
        this.modemImpl = modemImpl;
    }
    @Override
    public void dial(char[] a) {

    }

    @Override
    public void hangup() {

    }

    @Override
    public void send() {

    }

    @Override
    public void receive() {

    }
}
