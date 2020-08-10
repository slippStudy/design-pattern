package net.slipp.design.pattern.template;

import org.springframework.stereotype.Component;

@Component("templateMethodConcreteGreenClass")
public class ConcreteGreenClass extends AbstractClass{

    private int count = 0;

    @Override
    protected String getColor() {
        return "Green";
    }

    @Override
    protected int getCount() {
        return ++count;
    }
}
