package design.patterns.creational.abstractfactory.monitor;

public class MsiMonitor implements Monitor {

  @Override
  public void assemble() {
    System.out.println("Msi monitor assembled");
  }
}
