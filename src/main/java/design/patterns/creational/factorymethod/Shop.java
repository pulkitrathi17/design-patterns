package design.patterns.creational.factorymethod;

public abstract class Shop {
  public Gpu assembleGpu(){
    Gpu gpu = createGpu();
    gpu.assemble();
    return gpu;
  }

  // this is out factory method
  abstract Gpu createGpu();
}
