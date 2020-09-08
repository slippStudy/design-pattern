package net.slipp.design.pattern.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.slipp.design.pattern.monostate.RandomMonoStateCounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/mono-state")
@Api(tags = "MonoState")
public class MonoStatePatternController {

    private final List<RandomMonoStateCounterService> counters;

    public MonoStatePatternController(
            RandomMonoStateCounterService randomStateCounter1,
            RandomMonoStateCounterService randomStateCounter2,
            RandomMonoStateCounterService randomStateCounter3,
            RandomMonoStateCounterService randomStateCounter4,
            RandomMonoStateCounterService randomStateCounter5) {

        counters = new ArrayList<>(Arrays.asList(
                randomStateCounter1,
                randomStateCounter2,
                randomStateCounter3,
                randomStateCounter4,
                randomStateCounter5));
    }

    @ApiOperation("카운팅")
    @GetMapping("/counting")
    public long counting() {
        for (int i = 0, size = 100; i < size; ++i) {
            counters.forEach(RandomMonoStateCounterService::counting);
        }

        counters.forEach(RandomMonoStateCounterService::printCount);
        return counters.get(0).getTotalCount();
    }
}
