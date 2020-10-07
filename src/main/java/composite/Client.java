package composite;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(5, 2);
        Monitor monitor = new Monitor(10, 20);
        Speaker speaker = new Speaker(30, 20);

        CompositeComputer compositeComputer = new CompositeComputer();
        compositeComputer.addComponent(keyboard);
        compositeComputer.addComponent(monitor);
        compositeComputer.addComponent(speaker);

        System.out.printf("Computer Price : %d\n", compositeComputer.getPrice());
        System.out.printf("Computer Power : %d\n", compositeComputer.getPower());
    }
}
