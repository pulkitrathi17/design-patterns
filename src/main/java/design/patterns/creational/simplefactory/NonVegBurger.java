package design.patterns.creational.simplefactory;

public class NonVegBurger implements Burger{

  @Override
  public void createBurger() {
    System.out.println("NonVeg Burger created");
  }
}
