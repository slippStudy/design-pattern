import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    @Test
    public void 전략패턴테스트() {

        Money money = new Money(500D);
//        Calculator calculator = new AmountCalculator(new Money(200D));
        Calculator plusCalculator = new PlusCalculator(new Money(200D));

        Screening xmanScreen = new Screening(5, LocalDate.now(), 200);

        DiscountPolicy discountPolicy = new DiscountPolicy(plusCalculator);

        DiscountCondition discountCondition = (screening, audienceCount) -> {
            if (screening.equals(xmanScreen) && screening.hasSeat(audienceCount)){
                screening.reserveSeat(audienceCount);
                return true;
            }
            return false;
        };

        discountPolicy.addCondition(discountCondition);

        Money restMoney = discountPolicy.calculateFee(xmanScreen, 5, money);
        System.out.println(restMoney.amount());

    }
}
