package observer.before;

public class MockTimeSink implements TimeSink {
    private int itsHours;
    private int itsMinutes;
    private int itsSeconds;

    public int getItsHours() {
        return itsHours;
    }

    public int getItsMinutes() {
        return itsMinutes;
    }

    public int getItsSeconds() {
        return itsSeconds;
    }

    public void setTime(int hours, int minutes, int seconds) {
        this.itsHours = hours;
        this.itsMinutes = minutes;
        this.itsSeconds = seconds;
    }

}
