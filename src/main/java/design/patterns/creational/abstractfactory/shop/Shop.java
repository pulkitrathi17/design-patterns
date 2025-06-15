package design.patterns.creational.abstractfactory.shop;

import design.patterns.creational.abstractfactory.gpu.Gpu;
import design.patterns.creational.abstractfactory.monitor.Monitor;

// abstract factory
public abstract class Shop {

  public void assemble() {
    Gpu gpu = createGpu();
    Monitor monitor = createMonitor();
    gpu.assemble();
    monitor.assemble();
  }

  // this is our factory method
  abstract Gpu createGpu();

  // this is our factory method
  abstract Monitor createMonitor();
}
