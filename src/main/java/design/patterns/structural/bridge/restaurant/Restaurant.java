package design.patterns.structural.bridge.restaurant;

import design.patterns.structural.bridge.pizza.Pizza;

public abstract class Restaurant {
    Pizza pizza;
    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addTopping();
    abstract void addCrust();

    public void deliverPizza(){
        addTopping();
        addCrust();
        pizza.prepare();
    }
}
