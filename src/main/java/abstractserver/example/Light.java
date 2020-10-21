package abstractserver.example;

public class Light implements Swtichable{

    @Override
    public void on() {
        System.out.println("Light On");

    }

    @Override
    public void off() {
        System.out.println("Light Off");
    }
}
