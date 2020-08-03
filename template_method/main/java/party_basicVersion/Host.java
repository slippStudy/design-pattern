package party_basicVersion;

public class Host extends People{
    @Override
    String great() {
        return "안녕하세요, 이번 파티의 Host 입니다. ";
    }

    @Override
    protected boolean hasFork() {
        return true;
    }
}
