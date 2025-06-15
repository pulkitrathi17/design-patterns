package design.patterns.creational.factorymethod.shop;

import design.patterns.creational.factorymethod.gpu.Gpu;
import design.patterns.creational.factorymethod.gpu.MsiGpu;

public class MsiShop extends Shop{

  @Override
  Gpu createGpu() {
    return new MsiGpu();
  }
}
