package design.patterns.structural.composite;

public abstract class Product implements Box{
  String title;
  int price;

  Product(String title, int price){
    this.title = title;
    this.price = price;
  }
}
