package net.slipp.design.pattern.factory;

public interface CounterFactory {
    CounterService getCounter(CounterMethodType counterMethodType);
}
