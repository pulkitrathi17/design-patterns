package design.patterns.creational.factorymethod;

public class FactoryMethodPatternDemo {
  public static void main(String[] args){
    Shop msiShop = new MsiShop();
    msiShop.assembleGpu();

    Shop asusShop = new AsusShop();
    asusShop.assembleGpu();
  }
}
