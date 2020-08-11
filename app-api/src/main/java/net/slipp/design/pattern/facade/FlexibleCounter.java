package net.slipp.design.pattern.facade;

/**
 * 자주 변하는 카운터
 */
public class FlexibleCounter {

    private long count = 0;

    public long counting(InflexibleCountingCommand command) {
        switch (command.getCounterMethodType()) {
            case INCREASE:
                return this.count += command.getNumber();
            case DECREASE:
                return this.count -= command.getNumber();
        }

        throw new IllegalArgumentException();
    }
}
