package observer.process;

public interface ClockObserver {
    void update(int hours, int minutes, int seconds);
}
