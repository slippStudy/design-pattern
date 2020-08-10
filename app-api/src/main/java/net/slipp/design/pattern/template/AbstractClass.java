package net.slipp.design.pattern.template;

public abstract class AbstractClass {

    public String getColorCount() {
        return String.format("%s:%s", getColor(), getCount());
    }

    protected abstract String getColor();

    protected abstract int getCount();
}
