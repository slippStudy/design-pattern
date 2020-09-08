package net.slipp.design.pattern.singleton;

import org.springframework.beans.factory.BeanNameAware;

public interface CounterService extends BeanNameAware {
    long increaseCount();

    void printCount();
}
