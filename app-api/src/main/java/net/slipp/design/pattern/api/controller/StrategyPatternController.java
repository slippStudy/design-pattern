package net.slipp.design.pattern.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import net.slipp.design.pattern.strategy.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequiredArgsConstructor
@RestController
@RequestMapping("/strategy")
@Api(tags = "Strategy")
public class StrategyPatternController {

    private final CounterStrategyContext counterStrategyContext;
    private final IncreaseStrategy increaseStrategy;
    private final DecreaseStrategy decreaseStrategy;
    private final OneUnitStrategy oneUnitStrategy;
    private final RandomUnitStrategy randomUnitStrategy;

    @ApiOperation("카운트 하나 증가")
    @GetMapping("/increase/one")
    public String increaseOne() {
        counterStrategyContext
            .setMethodStrategy(increaseStrategy)
            .setUnitStrategy(oneUnitStrategy);

        return getResponseValue();
    }

    @ApiOperation("카운트 랜덤 증가")
    @GetMapping("/increase/random")
    public String increaseRandom() {
        counterStrategyContext
            .setMethodStrategy(increaseStrategy)
            .setUnitStrategy(randomUnitStrategy);

        return getResponseValue();
    }

    @ApiOperation("카운트 하나 감소")
    @GetMapping("/decrease/one")
    public String decreaseOne() {
        counterStrategyContext
            .setMethodStrategy(decreaseStrategy)
            .setUnitStrategy(oneUnitStrategy);

        return getResponseValue();
    }

    @ApiOperation("카운트 랜덤 감소")
    @GetMapping("/decrease/random")
    public String decreaseRandom() {
        counterStrategyContext
            .setMethodStrategy(decreaseStrategy)
            .setUnitStrategy(randomUnitStrategy);

        return getResponseValue();
    }

    @ApiOperation("랜덤 카운트")
    @GetMapping("/random")
    public String randomCounting() {
        counterStrategyContext
            .setMethodStrategy(new Random().nextBoolean() ? increaseStrategy : decreaseStrategy)
            .setUnitStrategy(new Random().nextBoolean() ? oneUnitStrategy : randomUnitStrategy);

        return getResponseValue();
    }

    private String getResponseValue() {
        return String.format("%s, count:%s",
            counterStrategyContext.getName(),
            counterStrategyContext.counting());
    }
}
