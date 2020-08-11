package library;

public class LibraryFacade {
    private Librarian librarian;
    private Cleaner cleaner;
    private Customer customer;

    public LibraryFacade(Librarian librarian, Cleaner cleaner, Customer customer) {
        this.librarian = librarian;
        this.cleaner = cleaner;
        this.customer = customer;
    }

    public void libraryWork() {
        librarian.work();
    }

    public void cleanWork() {
        cleaner.clean();
    }

    public void customerWork() {
        customer.book();
    }
}
