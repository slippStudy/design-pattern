package net.slipp.design.pattern.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IncreaseCounterService implements CounterService {
    private long count = 0;

    @Override
    public long counting() {
        return count += 1;
    }

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public void printCount() {
        log.info("This is IncreaseCounterService");
    }
}
