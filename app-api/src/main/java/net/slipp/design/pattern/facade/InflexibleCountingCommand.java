package net.slipp.design.pattern.facade;

import lombok.Getter;
import lombok.ToString;

/**
 * 잘 변하지 않는 명령
 */
@Getter
@ToString
public class InflexibleCountingCommand {
    private final CounterMethodType counterMethodType;
    private final long number;

    private InflexibleCountingCommand(CounterMethodType counterMethodType, long number) {
        this.counterMethodType = counterMethodType;
        this.number = number;
    }

    public static InflexibleCountingCommand of(CounterMethodType counterMethodType, long number) {
        return new InflexibleCountingCommand(counterMethodType, number);
    }
}
