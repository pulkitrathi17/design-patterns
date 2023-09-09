package design.patterns.creational.simplefactory;

public class BurgerFactory {
  static Burger createVegBurger(){
    return new VegBurger();
  }
  static Burger createNonVegBurger(){
    return new NonVegBurger();
  }
}
