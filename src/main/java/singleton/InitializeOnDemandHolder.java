package singleton;

public class InitializeOnDemandHolder {
    private InitializeOnDemandHolder() {
    }

    private static class LazyHolder {
        static final InitializeOnDemandHolder INSTANCE = new InitializeOnDemandHolder();
    }

    public static InitializeOnDemandHolder getInstance() {
        return LazyHolder.INSTANCE;
    }

}
