package design.patterns.structural.bridge;

import design.patterns.structural.bridge.pizza.*;
import design.patterns.structural.bridge.restaurant.*;

// The Bridge pattern is used to separate concerns across multiple dimensions. Here we are showing two levels -> pizza and restaurant
// Without Bridge pattern, we'd have to create new combination of subclasses.
// Bridge pattern use composition to avoid this issue.

public class Store {
    public static void main(String[] args) {
        // non veg italian restaurant
        Restaurant italianNonVegRestaurant = new ItalianRestaurant(new NonVegPizza());
        italianNonVegRestaurant.deliverPizza();

        // veg american restaurant
        Restaurant americanVegRestaurant = new AmericanRestaurant(new VegPizza());
        americanVegRestaurant.deliverPizza();
    }
}
