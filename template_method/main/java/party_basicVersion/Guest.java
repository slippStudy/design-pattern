package party_basicVersion;

public class Guest extends People{
    @Override
    String great() {
        return "....";
    }

    @Override
    protected boolean hasFork() {
        return true;
    }
}
