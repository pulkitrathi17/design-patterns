package design.patterns.creational.abstractfactory;

import design.patterns.creational.abstractfactory.gpu.Gpu;
import design.patterns.creational.abstractfactory.monitor.Monitor;

public abstract class Shop {
  // this is our factory method
  abstract Gpu createGpu();

  // this is our factory method
  abstract Monitor createMonitor();
}
