package net.slipp.design.pattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class DecreaseStrategy implements CountingMethodStrategy {

    @Override
    public long counting(long current, long number) {
        return current - number;
    }

    @Override
    public String getName() {
        return "Decrease";
    }
}
