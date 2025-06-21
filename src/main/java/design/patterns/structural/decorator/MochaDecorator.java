package design.patterns.structural.decorator;

public class MochaDecorator extends CondimentDecorator {
    public MochaDecorator(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.50;
    }
}