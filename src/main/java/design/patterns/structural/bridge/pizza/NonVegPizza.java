package design.patterns.structural.bridge.pizza;

public class NonVegPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Non Veg Pizza... with topping " + topping + " and crust " + crust);
    }
}
