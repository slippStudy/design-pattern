package sample.jdk;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {
    public static void main(String[] args) throws IOException {
        NetworkService networkService = new NetworkService(8085, 10);
        networkService.run();
    }
}

