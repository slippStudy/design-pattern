package abstractserver.example;

public class Switch {
    public static void main(String[] args) {
        Swtichable swtichable = new Light();

        swtichable.on();
        swtichable.off();
    }
}
