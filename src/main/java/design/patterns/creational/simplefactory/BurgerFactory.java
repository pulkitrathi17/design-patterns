package design.patterns.creational.simplefactory;

public class BurgerFactory {
  static Burger createBurger(String type){
    switch(type){
      case "veg":
        return new VegBurger();
      case "non-veg":
        return new NonVegBurger();
      default:
        throw new RuntimeException("Unknown Burger Type: " + type);
    }
  }
}
