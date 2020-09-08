package net.slipp.design.pattern.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SingletonCounterFactory implements CounterFactory {

    private final IncreaseCounterService increaseCounterService;
    private final DecreaseCounterService decreaseCounterService;

    @Override
    public CounterService getCounter(CounterMethodType counterMethodType) {
        switch (counterMethodType) {
            case INCREASE:
                return increaseCounterService;
            case DECREASE:
                return decreaseCounterService;
        }

        throw new IllegalArgumentException();
    }
}
