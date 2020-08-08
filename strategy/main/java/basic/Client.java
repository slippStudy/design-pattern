package basic;

import java.util.Scanner;

public class Client {
    static int x;
    static int y;
    public static int add(Calculator cal) {
        return cal.result(x,y);
    }

    public static int sub(Calculator cal) {
        return cal.result(x,y);
    }

    public static int div(Calculator cal) {
        return cal.result(x,y);
    }

    public static int mul(Calculator cal) {
        return cal.result(x,y);
    }

    public static void main(String[] helloWorld) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println(add((a,b) -> a+b));
        System.out.println(sub((a,b) -> a-b));
        System.out.println(div((a,b) -> a/b));
        System.out.println(mul((a,b) -> a*b));
    }
}