package net.slipp.design.pattern.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.slipp.design.pattern.template.AbstractClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/template-method")
@Api(tags = "템플릿 메소드 컨트롤러")
public class TemplateMethodController {

    private final AbstractClass redClass;
    private final AbstractClass blueClass;
    private final AbstractClass greenClass;
    private final List<AbstractClass> randomBox;

    public TemplateMethodController(
        @Qualifier("templateMethodConcreteRedClass") AbstractClass redClass,
        @Qualifier("templateMethodConcreteBlueClass") AbstractClass blueClass,
        @Qualifier("templateMethodConcreteGreenClass") AbstractClass greenClass) {

        this.redClass = redClass;
        this.blueClass = blueClass;
        this.greenClass = greenClass;
        this.randomBox = Arrays.asList(redClass, blueClass, greenClass);
    }

    @ApiOperation("Red 카운트")
    @GetMapping("/red")
    public String red() {
        return this.redClass.getColorCount();
    }

    @ApiOperation("Blue 카운트")
    @GetMapping("/blue")
    public String blue() {
        return this.blueClass.getColorCount();
    }

    @ApiOperation("Green 카운트")
    @GetMapping("/green")
    public String green() {
        return this.greenClass.getColorCount();
    }

    @ApiOperation("랜덤")
    @GetMapping("/random")
    public String random() {
        return getRandomClass().getColorCount();
    }

    private AbstractClass getRandomClass() {
        return this.randomBox.get(new Random().nextInt(3));
    }
}
