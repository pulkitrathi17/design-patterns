package design.patterns.creational.simplefactory;

// https://www.youtube.com/watch?v=EdFq_JIThqM

// https://stackoverflow.com/a/65331902/7089287


// Simple factory is not a design pattern as per gang of four but simpler to use for non-changing code requirements

public class Restaurant {
  public static void main(String[] args){
    Burger burger = BurgerFactory.createBurger("veg");
    // Burger burger = BurgerFactory.createBurger(non-veg);
    burger.createBurger();
  }
}
