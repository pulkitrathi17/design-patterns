package design.patterns.structural.adapter;

// main adapter class that implements old interface and wrap new library class object
public class ThirdPartyLibAdapter implements ILegacyUI{
  ThirdPartyLib thirdPartyLib;
  public ThirdPartyLibAdapter(ThirdPartyLib thirdPartyLib){
    this.thirdPartyLib = thirdPartyLib;
  }
  @Override
  public void load(String str) {
    Integer num = Integer.parseInt(str);
    thirdPartyLib.load(num);
  }
}
