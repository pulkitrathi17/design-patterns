package design.patterns.creational.builder;

public class Car {
  int num;
  String model;
  String color;
  int dimension;

  // private constructor to make sure only builder is used to create object
  private Car(CarBuilder carBuilder) {
    this.num = carBuilder.num;
    this.model = carBuilder.model;
    this.color = carBuilder.color;
    this.dimension = carBuilder.dimension;
  }

  void show(){
    System.out.println(num + " " + model + " " + color + " " + dimension);
  }

  // static builder class because if you make the builder class non-static (i.e., remove the static keyword),
  // you would need to create an instance of builder class explicitly with new Car class object creation.
  // In that case, you would use it something like this: new Car().new CarBuilder().build()
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
      return new Car(this);
    }
  }

}
