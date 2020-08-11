package net.slipp.design.pattern.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import net.slipp.design.pattern.command.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequiredArgsConstructor
@RestController
@RequestMapping("/command")
@Api(tags = "Command")
public class CommandPatternController {

    private final Receiver countReceiver;

    @ApiOperation("카운트 증가")
    @GetMapping("/increase")
    public int increase() {
        var increaseCommand = new ConcreteIncreaseCommand(countReceiver);
        var increaseInvoker = new Invoker(increaseCommand);

        increaseInvoker.action();

        return countReceiver.getCount();
    }

    @ApiOperation("카운트 감소")
    @GetMapping("/decrease")
    public int decrease() {
        var decreaseCommand = new ConcreteDecreaseCommand(countReceiver);
        var decreaseInvoker = new Invoker(decreaseCommand);

        decreaseInvoker.action();

        return countReceiver.getCount();
    }

    @ApiOperation("카운트 랜덤")
    @GetMapping("/random")
    public int random() {
        var randomCommand = getRandomCommand();
        var randomInvoker = new Invoker(randomCommand);

        randomInvoker.action();

        return countReceiver.getCount();
    }

    private Command getRandomCommand() {
        var trueOrFalse = new Random().nextBoolean();
        if (trueOrFalse) {
            return new ConcreteIncreaseCommand(countReceiver);
        } else {
            return new ConcreteDecreaseCommand(countReceiver);
        }
    }
}
