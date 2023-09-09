package design.patterns.creational.factorymethod;

public class AsusGpu implements Gpu {

  @Override
  public void assemble() {
    System.out.println("Asus gpu assembled");
  }
}
