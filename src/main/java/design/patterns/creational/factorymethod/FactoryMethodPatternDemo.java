package design.patterns.creational.factorymethod;

import design.patterns.creational.factorymethod.shop.AsusShop;
import design.patterns.creational.factorymethod.shop.MsiShop;
import design.patterns.creational.factorymethod.shop.Shop;

public class FactoryMethodPatternDemo {
  public static void main(String[] args){
    Shop msiShop = new MsiShop();
    msiShop.assembleGpu();

    Shop asusShop = new AsusShop();
    asusShop.assembleGpu();
  }
}
