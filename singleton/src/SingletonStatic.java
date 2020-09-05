import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonStatic {

    private static SingletonStatic singletonStatic;
    private static int num = 0;

    public static SingletonStatic getInstance() {
        if (singletonStatic == null) {
            System.out.println(num++);
            singletonStatic = new SingletonStatic();
        }
        return singletonStatic;
    }

    private SingletonStatic() {
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                SingletonStatic singleton = SingletonStatic.getInstance();
            });
        }
        service.shutdown();
    }
}
