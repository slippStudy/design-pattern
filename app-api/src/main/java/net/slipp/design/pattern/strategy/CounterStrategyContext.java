package net.slipp.design.pattern.strategy;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Accessors(chain = true)
@Component
public class CounterStrategyContext implements WhoAmIStrategy {

    private long count = 0;

    @Getter
    @Setter
    private CountingMethodStrategy methodStrategy;

    @Getter
    @Setter
    private CountingUnitStrategy unitStrategy;

    public long counting() {
        return this.count = methodStrategy.counting(this.count, unitStrategy.getNumber());
    }

    @Override
    public String getName() {
        return String.format("%s %s", methodStrategy.getName(), unitStrategy.getName());
    }
}
