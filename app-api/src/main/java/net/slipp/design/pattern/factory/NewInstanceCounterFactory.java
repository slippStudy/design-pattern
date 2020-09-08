package net.slipp.design.pattern.factory;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary /* 이 어노테이션을 다른 Factory에 선언하면 해당 Factory가 사용된다 */
public class NewInstanceCounterFactory implements CounterFactory {
    @Override
    public CounterService getCounter(CounterMethodType counterMethodType) {
        switch (counterMethodType) {
            case INCREASE:
                return new IncreaseCounterService();
            case DECREASE:
                return new DecreaseCounterService();
        }

        throw new IllegalArgumentException();
    }
}
