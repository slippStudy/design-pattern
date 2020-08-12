import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    @Test
    public void templatePattern() {

        Money money = new Money(500D);
        Screening xmanScreen = new Screening(5, LocalDate.now(), 200);

        DiscountPolicyTemplate discountPolicy = new AmountPolicy(new Money(200D));

        DiscountCondition discountCondition = (screening, audienceCount) -> {
            if (screening.equals(xmanScreen) && screening.hasSeat(audienceCount)){
                screening.reserveSeat(audienceCount);
                return true;
            }
            return false;
        };
        discountPolicy.addCondition(discountCondition);

        Money 남은돈 = discountPolicy.calculateFee(xmanScreen, 5, money);
        System.out.println(남은돈.amount());

    }
}
