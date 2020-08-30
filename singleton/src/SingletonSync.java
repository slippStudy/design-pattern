import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonSync {

    private static SingletonSync singletonStatic;
    private static int num = 0;
    public static synchronized SingletonSync getInstance() {
        if (singletonStatic == null) {
            System.out.println(num++);
            singletonStatic = new SingletonSync();
        }
        return singletonStatic;
    }

    private SingletonSync() {
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                SingletonSync singleton = SingletonSync.getInstance();

            });
        }
        service.shutdown();
    }
}
