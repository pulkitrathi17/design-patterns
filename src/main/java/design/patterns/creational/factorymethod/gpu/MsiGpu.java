package design.patterns.creational.factorymethod.gpu;

public class MsiGpu implements Gpu {

  @Override
  public void assemble() {
    System.out.println("Msi gpu assembled");
  }
}
