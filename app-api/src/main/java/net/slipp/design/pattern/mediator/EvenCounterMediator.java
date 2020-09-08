package net.slipp.design.pattern.mediator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EvenCounterMediator {

    private long evenCount = 0;

    public void notify(long count) {
        if (count % 2 == 0) {
            evenCount += 1;
        }

        log.info("Even counter is {}", evenCount);
    }
}
