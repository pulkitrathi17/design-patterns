package design.patterns.creational.singleton;

// https://www.youtube.com/watch?v=tSZn4wkBIu8

public class SingletonClass {
  // volatile to make object read thread safe
  // static
  private volatile static SingletonClass instance;

  // private constructor
  private SingletonClass(){
    System.out.println("SingletonClass class instantiated...");
  }

  // static function to access static variable "instance"
  // double locking to make null checking efficient without synchronized block if not null (that's why instance is declared volatile)
  // synchronized to make initialization thread safe
  public static SingletonClass getInstance() {
    if(instance==null){
      synchronized (SingletonClass.class){
        if(instance==null) {
          instance = new SingletonClass();
        }
      }
    }
    return instance;
  }
}
