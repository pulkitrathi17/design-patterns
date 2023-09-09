package design.patterns.creational.abstractfactory.gpu;

public class MsiGpu implements Gpu {

  @Override
  public void assemble() {
    System.out.println("Msi gpu assembled");
  }
}
