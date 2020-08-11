package net.slipp.design.pattern.strategy;

public interface CountingMethodStrategy extends WhoAmIStrategy {
    long counting(long current, long number);
}
