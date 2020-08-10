package net.slipp.design.pattern.template;

import org.springframework.stereotype.Component;

@Component("templateMethodConcreteBlueClass")
public class ConcreteBlueClass extends AbstractClass{

    private int count = 0;

    @Override
    protected String getColor() {
        return "Blue";
    }

    @Override
    protected int getCount() {
        return ++count;
    }
}
