package net.slipp.design.pattern.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "예제기능")
public class SampleController {

  @ApiOperation("현재시간조회하기")
  @GetMapping("/example")
  public String example() {
    return LocalDateTime.now().toString();
  }
}
