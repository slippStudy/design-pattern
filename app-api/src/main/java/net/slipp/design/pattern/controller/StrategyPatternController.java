package net.slipp.design.pattern.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategy")
@Api(tags = "스트래터지 컨트롤러")
public class StrategyPatternController {
}
