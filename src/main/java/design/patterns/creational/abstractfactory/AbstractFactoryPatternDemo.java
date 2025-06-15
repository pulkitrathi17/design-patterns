package design.patterns.creational.abstractfactory;

// https://www.youtube.com/watch?v=QNpwWkdFvgQ


//  Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
//  Use Case: When you need to create objects that are designed to work together.


import design.patterns.creational.abstractfactory.shop.AsusShop;
import design.patterns.creational.abstractfactory.shop.MsiShop;
import design.patterns.creational.abstractfactory.shop.Shop;

public class AbstractFactoryPatternDemo {
  public static void main(String[] args){
    Shop msiShop = new MsiShop();
    msiShop.assemble();

    Shop asusShop = new AsusShop();
    asusShop.assemble();
  }
}
