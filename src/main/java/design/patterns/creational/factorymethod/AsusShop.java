package design.patterns.creational.factorymethod;

public class AsusShop extends Shop{

  @Override
  Gpu createGpu() {
    return new AsusGpu();
  }
}
