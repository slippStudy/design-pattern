import adapter.DedicatedModem;
import adapter.DedicatedModemAdapter;
import org.junit.jupiter.api.Test;

class DeduserTest {
    @Test
    public void test() {
        new DedicatedModemAdapter(new DedicatedModem()).send();


    }


}