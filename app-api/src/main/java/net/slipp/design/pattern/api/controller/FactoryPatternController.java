package net.slipp.design.pattern.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import net.slipp.design.pattern.factory.CounterFactory;
import net.slipp.design.pattern.factory.CounterMethodType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import static net.slipp.design.pattern.factory.CounterMethodType.DECREASE;
import static net.slipp.design.pattern.factory.CounterMethodType.INCREASE;

@RequiredArgsConstructor
@RestController
@RequestMapping("/factory")
@Api(tags = "Factory")
public class FactoryPatternController {

    private final CounterFactory counterFactory;

    @ApiOperation("카운팅")
    @GetMapping("/counting")
    public long counting() {

        var counter = counterFactory.getCounter(getRandomCounterMethodType());
        for (int i = 0, size = new Random().nextInt(100); i < size; ++i) {
            counter.counting();
        }

        counter.printCount();
        return counter.getCount();
    }

    private CounterMethodType getRandomCounterMethodType(){
        return new Random().nextDouble() <= 0.5d ? INCREASE : DECREASE;
    }
}
