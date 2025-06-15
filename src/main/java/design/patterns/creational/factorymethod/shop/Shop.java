package design.patterns.creational.factorymethod.shop;

import design.patterns.creational.factorymethod.gpu.Gpu;

public abstract class Shop {
  public void assembleGpu(){
    Gpu gpu = createGpu();
    gpu.assemble();
  }

  // this is our factory method
  abstract Gpu createGpu();
}
