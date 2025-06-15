package design.patterns.creational.factorymethod.gpu;

public class AsusGpu implements Gpu {

  @Override
  public void assemble() {
    System.out.println("Asus gpu assembled");
  }
}
