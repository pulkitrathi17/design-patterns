package design.patterns.structural.bridge.restaurant;

import design.patterns.structural.bridge.pizza.Pizza;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addTopping() {
        pizza.setTopping("Italian topping");
    }

    @Override
    void addCrust() {
        pizza.setCrust("Italian crust");
    }
}
