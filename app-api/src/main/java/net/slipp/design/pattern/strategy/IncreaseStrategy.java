package net.slipp.design.pattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class IncreaseStrategy implements CountingMethodStrategy {
    @Override
    public long counting(long current, long number) {
        return current + number;
    }

    @Override
    public String getName() {
        return "Increase";
    }
}
