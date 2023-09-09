package design.patterns.creational.factory;

// https://www.youtube.com/watch?v=EdFq_JIThqM

// https://stackoverflow.com/a/65331902/7089287

public class Restaurant {
  public static void main(String[] args){
    Burger burger = BurgerFactory.createVegBurger();
    // Burger burger = BurgerFactory.createNonBurger();
    burger.createBurger();
  }
}
