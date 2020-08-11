package library;

public class Library {
//    private Librarian librarian;
//    private Cleaner cleaner;
//    private Customer customer;
    private LibraryFacade libraryFacade;

    public Library(LibraryFacade libraryFacade) {
        this.libraryFacade = libraryFacade;
    }

    public void work() {
        libraryFacade.libraryWork();
        libraryFacade.cleanWork();
        libraryFacade.customerWork();
    }
}
