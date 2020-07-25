package command;

/**
 * Invoker
 */
public class AddEmploy {
    private Transaction transaction;

    public AddEmploy(Transaction transaction) {
        this.transaction = transaction;
    }

    public void add() {
        transaction.execute();
    }
}
