package design.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyImplementation implements Service{
  Implementation imp;
  Map<String, String> map = new HashMap<>();

  public ProxyImplementation(Implementation imp) {
    this.imp = imp;
  }

  @Override
  public String load(String str) {
    if(map.containsKey(str)){
      System.out.print("From Proxy: ");
      return map.get(str);
    }
    map.put(str, imp.load(str));
    return map.get(str);
  }
}
