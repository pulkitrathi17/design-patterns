package design.patterns.creational.simplefactory;

public class VegBurger implements Burger{

  @Override
  public void createBurger() {
    System.out.println("Veg Burger created");
  }
}
