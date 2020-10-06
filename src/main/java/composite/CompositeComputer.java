package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComputer implements Computer{
    private List<Computer> components = new ArrayList<>();

    public void addComponent(Computer computer) {
        this.components.add(computer);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (Computer computer : components) {
            price += computer.getPrice();
        }
        return price;
    }

    @Override
    public int getPower() {
        int power = 0;
        for (Computer computer : components) {
            power += computer.getPower();
        }
        return power;
    }
}
