package design.patterns.structural.adapter;

// main adapter class that implements old interface(inheritance) and wrap new library class object(composition)
public class ThirdPartyLibAdapter implements ILegacyUI {
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
