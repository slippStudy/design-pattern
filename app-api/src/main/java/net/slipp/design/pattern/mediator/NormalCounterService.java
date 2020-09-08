package net.slipp.design.pattern.mediator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class NormalCounterService {

    private final EvenCounterMediator evenCounterMediator;
    private long count = 0;

    public long increaseCount(){
        count += 1;
        evenCounterMediator.notify(count);
        return count;
    }
}
