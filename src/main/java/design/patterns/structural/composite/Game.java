package design.patterns.structural.composite;

public class Game extends Product{

  int tax;
  Game(String title, int price, int tax) {
    super(title, price);
    this.tax = tax;
  }

  @Override
  public int calculatePrice() {
    return price+tax;
  }
}
