package design.patterns.creational.abstractfactory;

import design.patterns.creational.abstractfactory.gpu.AsusGpu;
import design.patterns.creational.abstractfactory.gpu.Gpu;
import design.patterns.creational.abstractfactory.monitor.AsusMonitor;
import design.patterns.creational.abstractfactory.monitor.Monitor;

// concrete factory
public class AsusShop extends Shop {

  @Override
  Gpu createGpu() {
    return new AsusGpu();
  }

  @Override
  Monitor createMonitor() {
    return new AsusMonitor();
  }
}
