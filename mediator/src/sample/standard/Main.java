package sample.standard;

public class Main {

    static int a = 1;
    int b = 1;

    public Main(int b) {
        this.b = b;
    }

    public Main() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        Main.a = a;
    }

    public void add() {
        a = a + 1;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Main main1 = new Main();
        Main main2 = new Main();
        Main main3 = new Main();

        main.add();
        main1.add();
        main2.add();
        main3.add();


        MainImpl main4 = new MainImpl();
        main4.add();

        main4 = null;

    }
}
