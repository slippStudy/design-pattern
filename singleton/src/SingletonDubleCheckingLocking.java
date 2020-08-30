public class SingletonDubleCheckingLocking {

    private static SingletonDubleCheckingLocking singletonStatic;

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
    }
}
