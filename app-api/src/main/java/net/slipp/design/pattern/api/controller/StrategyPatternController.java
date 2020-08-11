package net.slipp.design.pattern.api.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategy")
@Api(tags = "Strategy")
public class StrategyPatternController {
}
