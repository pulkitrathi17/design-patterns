package design.patterns.creational.abstractfactory;

// https://www.youtube.com/watch?v=QNpwWkdFvgQ

public class AbstractFactoryPatternDemo {
  public static void main(String[] args){
    Shop msiShop = new MsiShop();
    msiShop.createGpu().assemble();
    msiShop.createMonitor().assemble();

    Shop asusShop = new AsusShop();
    asusShop.createGpu().assemble();
    asusShop.createMonitor().assemble();
  }
}
