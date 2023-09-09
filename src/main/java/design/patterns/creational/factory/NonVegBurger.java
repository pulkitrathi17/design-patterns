package design.patterns.creational.factory;

public class NonVegBurger implements Burger{

  @Override
  public void createBurger() {
    System.out.println("NonVeg Burger created");
  }
}
