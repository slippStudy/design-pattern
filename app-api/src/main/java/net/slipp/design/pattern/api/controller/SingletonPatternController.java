package net.slipp.design.pattern.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.slipp.design.pattern.singleton.CounterService;
import net.slipp.design.pattern.singleton.MultipleCounterService;
import net.slipp.design.pattern.singleton.SingletonCounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@RestController
@RequestMapping("/singleton")
@Api(tags = "Singleton")
public class SingletonPatternController {

    private final SingletonCounterService singletonCounterService;
    private final Set<CounterService> counters;

    public SingletonPatternController(
            SingletonCounterService singletonCounter,
            MultipleCounterService fooCounter,
            MultipleCounterService barCounter,
            MultipleCounterService booCounter) {

        this.singletonCounterService = singletonCounter;
        this.counters = new HashSet<>(Arrays.asList(fooCounter, barCounter, booCounter));
    }

    @ApiOperation("카운팅")
    @GetMapping("/counting")
    public long counting() {

        for (var counter : counters) {
            increasingRandomly(counter);
        }

        for (var counter : counters) {
            printCount(counter);
        }

        singletonCounterService.printCount();

        return singletonCounterService.getTotalCount();
    }

    private void increasingRandomly(CounterService counterService) {
        for (int i = 0, max = new Random().nextInt(10); i < max; ++i) {
            counterService.increaseCount();
        }
    }

    private void printCount(CounterService counterService) {
        counterService.printCount();
    }
}
