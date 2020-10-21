package bridge;

public interface ModemImplementation {
    void dial(char[] a);

    void hangup();

    void send();

    void receive();
}