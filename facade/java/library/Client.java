package library;

public class Client {
    public static void main(String[] args) {
        Library library = new Library(new LibraryFacade(new Librarian(),new Cleaner(),new Customer()));
        library.work();
    }
}
