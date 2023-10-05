package design.patterns.structural.composite;

public class Demo {

  public static void main(String[] args) {

    CompositeBox compositeBox = new CompositeBox(
        new CompositeBox(
            new CompositeBox(new Book("book1", 10)),
            new CompositeBox(new Book("book2", 15))
        ),
        new CompositeBox(
            new CompositeBox(new Game("game1", 20, 50))
        ),
        new CompositeBox(
            new Book("book3", 20),
            new Game("game2", 25, 50)
        )
    );

    System.out.println(compositeBox.calculatePrice());
  }
}
