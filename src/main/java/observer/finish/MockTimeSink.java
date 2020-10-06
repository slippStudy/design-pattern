package observer.finish;

public class MockTimeSink implements Observer {
    private int hours;
    private int minutes;
    private int seconds;
    private TimeSource source;

    public MockTimeSink(TimeSource source) {
        this.source = source;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void update() {
        this.hours = source.getHours();
        this.minutes = source.getMinutes();
        this.seconds = source.getSeconds();
    }
}
