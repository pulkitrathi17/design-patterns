package design.patterns.behavioral.template;

// youtube.com/watch?v=cGoVDzHvD4A

public abstract class BaseGameLoader {
  // our template function that has multiple steps as functions that can be implemented by other classes
  public void loadFiles(){
    func1();
    func2();
    func3();
    func4();
  }
  abstract void func1();
  abstract void func2();
  void func3(){
    System.out.println("Already implemented common call like cleaning cache");
  }

  protected void func4(){
    System.out.println("Already implemented common call like cleaning cache");
  }

}
