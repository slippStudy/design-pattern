package net.slipp.design.pattern.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 실제 기능을 실행하는 수신자
 */
@Slf4j
@Component
public class Receiver {
    private int count = 0;

    public int increase() {
        count += 1;

        return count;
    }

    public int decrease() {
        count -= 1;

        return count;
    }

    public int getCount() {
        return count;
    }
}
