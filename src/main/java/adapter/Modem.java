package adapter;

public interface Modem {
    void dial(char[] a);
    void hangup();
    void send();
    void receive();
}
