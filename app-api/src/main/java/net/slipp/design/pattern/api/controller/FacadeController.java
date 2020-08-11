package net.slipp.design.pattern.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import net.slipp.design.pattern.facade.CounterFacade;
import net.slipp.design.pattern.facade.CounterMethodType;
import net.slipp.design.pattern.facade.InflexibleCountingCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequiredArgsConstructor
@RestController
@RequestMapping("/facade")
@Api(tags = "Facade")
public class FacadeController {

    private final CounterFacade counterFacade;

    @ApiOperation("카운팅")
    @GetMapping("/counting")
    public long counting() {
        var command = InflexibleCountingCommand.of(
            new Random().nextBoolean() ? CounterMethodType.INCREASE : CounterMethodType.DECREASE,
            new Random().nextInt(10)
        );

        return counterFacade.counting(command);
    }

}
