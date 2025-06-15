package design.patterns.creational.factorymethod.shop;

import design.patterns.creational.factorymethod.gpu.AsusGpu;
import design.patterns.creational.factorymethod.gpu.Gpu;

public class AsusShop extends Shop{

  @Override
  Gpu createGpu() {
    return new AsusGpu();
  }
}
