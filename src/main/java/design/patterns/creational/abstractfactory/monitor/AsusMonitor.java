package design.patterns.creational.abstractfactory.monitor;

public class AsusMonitor implements Monitor {

  @Override
  public void assemble() {
    System.out.println("Asus monitor assembled");
  }
}
