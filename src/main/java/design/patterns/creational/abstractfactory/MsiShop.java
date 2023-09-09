package design.patterns.creational.abstractfactory;

import design.patterns.creational.abstractfactory.gpu.Gpu;
import design.patterns.creational.abstractfactory.gpu.MsiGpu;
import design.patterns.creational.abstractfactory.monitor.Monitor;
import design.patterns.creational.abstractfactory.monitor.MsiMonitor;

public class MsiShop extends Shop {

  @Override
  Gpu createGpu() {
    return new MsiGpu();
  }

  @Override
  Monitor createMonitor() {
    return new MsiMonitor();
  }
}
