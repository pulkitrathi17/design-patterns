package design.patterns.structural.adapter;

public class LegacyUI implements ILegacyUI{

  @Override
  public void load(String str) {
    System.out.println("Old lib: " + str);
  }
}
