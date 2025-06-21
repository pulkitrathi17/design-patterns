package design.patterns.structural.bridge.restaurant;

import design.patterns.structural.bridge.pizza.Pizza;

public class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addTopping() {
        pizza.setTopping("American topping");
    }

    @Override
    void addCrust() {
        pizza.setCrust("American crust");
    }
}
