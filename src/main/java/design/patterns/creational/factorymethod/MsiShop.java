package design.patterns.creational.factorymethod;

public class MsiShop extends Shop{

  @Override
  Gpu createGpu() {
    return new MsiGpu();
  }
}
