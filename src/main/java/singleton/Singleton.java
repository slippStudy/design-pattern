package singleton;

public class Singleton {
    private static Singleton singleton;

    public synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
