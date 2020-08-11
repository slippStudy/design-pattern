package net.slipp.design.pattern.facade;

import org.springframework.stereotype.Component;

/**
 * CounterFacade 내부 처리가 변해도 이 클래스를 사용하는 곳에 영향을 최소화
 */
@Component
public class CounterFacade {

    private final FlexibleCounter counter;

    public CounterFacade() {
        this.counter = new FlexibleCounter();
    }

    public long counting(InflexibleCountingCommand command) {
        return counter.counting(command);
    }
}
