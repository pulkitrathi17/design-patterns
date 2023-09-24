package design.patterns.structural.proxy;

public class Implementation implements Service{

  @Override
  public String load(String str) {
    return ("Real Implementation: " + str);
  }
}
