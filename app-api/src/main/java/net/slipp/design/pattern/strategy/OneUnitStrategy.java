package net.slipp.design.pattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class OneUnitStrategy implements CountingUnitStrategy {
    @Override
    public long getNumber() {
        return 1;
    }

    @Override
    public String getName() {
        return "OneUnit";
    }
}
