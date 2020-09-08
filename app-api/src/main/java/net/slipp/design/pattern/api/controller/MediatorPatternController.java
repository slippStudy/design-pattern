package net.slipp.design.pattern.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import net.slipp.design.pattern.mediator.NormalCounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mediator")
@Api(tags = "Mediator")
public class MediatorPatternController {

    private final NormalCounterService counterService;

    @ApiOperation("카운팅")
    @GetMapping("/counting")
    public long counting() {
        return counterService.increaseCount();
    }
}
