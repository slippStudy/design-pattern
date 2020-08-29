package sample.jdk;

import java.net.Socket;

public class Handler implements Runnable {
    private final Socket socket;

    Handler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        System.out.println("Hello World");
    }
}
