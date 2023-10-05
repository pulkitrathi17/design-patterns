package design.patterns.structural.composite;

public class Book extends Product {

  Book(String title, int price) {
    super(title, price);
  }

  @Override
  public int calculatePrice() {
    return price;
  }
}
