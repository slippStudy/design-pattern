package sample.jdk;

import java.util.Timer;
import java.util.TimerTask;

public class TimeSche {

    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask helloWorldTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };

        timer.schedule(helloWorldTask, 5000L, 500L);

    }
}
