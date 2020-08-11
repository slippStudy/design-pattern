package net.slipp.design.pattern.strategy;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomUnitStrategy implements CountingUnitStrategy {
    @Override
    public long getNumber() {
        return new Random().nextInt(10);
    }

    @Override
    public String getName() {
        return "RandomUnit";
    }
}
