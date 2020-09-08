package net.slipp.design.pattern.monostate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import static net.slipp.design.pattern.monostate.CounterState.DECREASE;
import static net.slipp.design.pattern.monostate.CounterState.INCREASE;

@RequiredArgsConstructor
@Slf4j
@Scope("prototype")
@Service
public class RandomMonoStateCounterService {
    private static final AtomicReference<CounterState> counterState = new AtomicReference<>(INCREASE);
    private static final AtomicLong totalCount = new AtomicLong(0L);
    private int count = 0;

    public int counting() {
        if (counterState.get() == INCREASE) {
            count += 1;
            totalCount.incrementAndGet();
        } else {
            count -= 1;
            totalCount.decrementAndGet();
        }

        if (isTrueAtCertainRate()) {
            counterState.set(counterState.get() == INCREASE ? DECREASE : INCREASE);
            log.info("Counter change state {}!", counterState.get());
        }

        return count;
    }

    public void printCount() {
        log.info("CounterState is {}, Count is {}", counterState.get(), count);
    }

    public long getTotalCount() {
        return totalCount.get();
    }

    private boolean isTrueAtCertainRate() {
        return new Random().nextDouble() <= 0.1d;
    }
}
