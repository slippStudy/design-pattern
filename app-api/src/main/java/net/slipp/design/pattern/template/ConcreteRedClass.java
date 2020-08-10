package net.slipp.design.pattern.template;

import org.springframework.stereotype.Component;

@Component("templateMethodConcreteRedClass")
public class ConcreteRedClass extends AbstractClass {

    private int count = 0;

    @Override
    protected String getColor() {
        return "Red";
    }

    @Override
    protected int getCount() {
        return ++count;
    }
}
