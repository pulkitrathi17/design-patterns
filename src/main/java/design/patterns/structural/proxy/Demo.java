package design.patterns.structural.proxy;

// https://www.youtube.com/watch?v=TS5i-uPXLs8

public class Demo {
  public static void main(String[] args) {
    Implementation imp = new Implementation();
    Service proxy = new ProxyImplementation(imp);

    System.out.println(proxy.load("pulk1"));
    System.out.println(proxy.load("pulk2"));
    System.out.println(proxy.load("pulk1"));
  }
}
