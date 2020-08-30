import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTonSample {
    private static int num = 0;
    private static final SingleTonSample instance = new SingleTonSample();

    public static SingleTonSample getInstance() {
        System.out.println(num++);
        return instance;
    }

    public void print() {
        System.out.println("Hello World");
    }

    public SingleTonSample() {
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                SingleTonSample singleton = SingleTonSample.getInstance();

            });
        }
        service.shutdown();
    }

}
