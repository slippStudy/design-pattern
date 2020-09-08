package net.slipp.design.pattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SingletonCounterService implements CounterService {

    private String name;
    private long totalCount = 0;

    public long getTotalCount() {
        return totalCount;
    }

    @Override
    public long increaseCount() {
        return totalCount += 1;
    }

    @Override
    public void printCount() {
        log.info("Counter name is {} And Total Count is {}", name, totalCount);
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
