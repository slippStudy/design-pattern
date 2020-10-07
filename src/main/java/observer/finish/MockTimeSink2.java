package observer.finish;

public class MockTimeSink2 implements Observer {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void update(TimeSource source) {
        this.hours = source.getHours();
        this.minutes = source.getMinutes();
        this.seconds = source.getSeconds();
        System.out.printf(
                "** Hours : %d, Minutes : %d, Seconds : %d **\n",
                this.hours,
                this.minutes,
                this.seconds);

//        System.out.println(this);
    }
}
