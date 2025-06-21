package design.patterns.structural.bridge.pizza;

public class VegPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza... with topping " + topping + " and crust " + crust);
    }
}
