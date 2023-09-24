package design.patterns.creational.builder;

public class Car {
  int num;
  String model;
  String color;
  int dimension;

  // private constructor to make sure only builder is used to create object
  private Car(int num, String model, String color, int dimension) {
    this.num = num;
    this.model = model;
    this.color = color;
    this.dimension = dimension;
  }

  void show(){
    System.out.println(num + " " + model + " " + color + " " + dimension);
  }

  // static builder class because if you make the builder class non-static (i.e., remove the static keyword),
  // you would need to create an instance of the outer class before creating an instance of the builder.
  // In this case, you would use it like this: new Car().new CarBuilder().build().
  public static class CarBuilder {
    private int num;
    private String model;
    private String color;
    private int dimension;

    public CarBuilder num(int num) {
      this.num = num;
      return this;
    }

    public CarBuilder model(String model) {
      this.model = model;
      return this;
    }

    public CarBuilder color(String color) {
      this.color = color;
      return this;
    }

    public CarBuilder dimension(int dimension) {
      this.dimension = dimension;
      return this;
    }

    public Car build(){
      return new Car(num, model, color, dimension);
    }
  }

}
