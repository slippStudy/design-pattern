import java.util.LinkedList;
import java.util.List;

public class SingletonDubleCheckingLocking {

    private static SingletonDubleCheckingLocking singletonStatic;
    private List<String> a= new LinkedList<>();
    public static SingletonDubleCheckingLocking getSingletonStatic() {
        if (singletonStatic == null) {
            synchronized (SingletonDubleCheckingLocking.class) {
                if (singletonStatic == null) {
                    singletonStatic = new SingletonDubleCheckingLocking();
                }
            }
        }
        return singletonStatic;
    }

    private SingletonDubleCheckingLocking() {
        a.add("AA");a.add("AA");

    }
}
