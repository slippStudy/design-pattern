package library;

public class Customer {
    public void book() {
        System.out.println("예약합니다.");
    }

    public Librarian job() {
        return new Librarian();
    }
}
