package observer.process;

public class MockTimeSource implements TimeSource {
    private ClockObserver itsObserver;

    public void setTime(int hours, int minutes, int seconds) {
        itsObserver.update(hours, minutes, seconds);
    }

    public void setObserver(ClockObserver observer) {
        itsObserver = observer;
    }
}
