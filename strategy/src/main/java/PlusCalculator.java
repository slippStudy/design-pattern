public class PlusCalculator implements Calculator {

    private final Money amount;

    public PlusCalculator(Money amount) {
        this.amount = amount;
    }

    @Override
    public Money calculateFee(Money fee) {
        return fee.plus(amount);
    }
}
