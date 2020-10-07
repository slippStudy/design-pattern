package observer.finish;


public class Client {
    private MockTimeSource source;
    private MockTimeSink sink;
    private MockTimeSink2 sink2;

    public void setup() {
        source = new MockTimeSource();
        sink = new MockTimeSink();
        sink2 = new MockTimeSink2();
        source.registerObserver(sink);
        source.registerObserver(sink2);


    }

    public void testTimeChange() {
        source.setTime(1,2,3);
        source.setTime(3, 4, 5);
        source.setTime(7, 8, 9);
    }
}
