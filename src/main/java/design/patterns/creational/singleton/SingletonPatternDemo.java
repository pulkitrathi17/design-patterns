package design.patterns.creational.singleton;

public class SingletonPatternDemo {
  public static void main(String args[]){
    // will print object instantiation log only once
    SingletonClass s1 = SingletonClass.getInstance();
    SingletonClass s2 = SingletonClass.getInstance();
  }
}
