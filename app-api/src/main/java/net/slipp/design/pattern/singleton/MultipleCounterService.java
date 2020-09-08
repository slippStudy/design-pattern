package net.slipp.design.pattern.singleton;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Scope("prototype")
@Service
public class MultipleCounterService implements CounterService {

    private final SingletonCounterService singletonCounterService;
    private String name;
    private long count = 0;

    @Override
    public long increaseCount() {
        singletonCounterService.increaseCount();
        return count += 1;
    }

    @Override
    public void printCount() {
        log.info("Counter name is {} And Count is {}", name, count);
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
