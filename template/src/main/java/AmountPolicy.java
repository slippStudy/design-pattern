public class AmountPolicy extends DiscountPolicyTemplate {
    private final Money amount;

    public AmountPolicy(Money amount) {
        this.amount = amount;
    }

    @Override
    public Money calculateFee(Money fee) {
        return fee.minus(amount);
    }
}