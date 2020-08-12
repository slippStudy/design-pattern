public class Money {

    private final Double amount;

    Money(Double amount) {
        this.amount = amount;
    }

    public Money minus(Money amount) {
        return new Money(this.amount > amount.amount ? this.amount - amount.amount : 0.0);
    }

    public Double amount() {
        return amount;
    }
}