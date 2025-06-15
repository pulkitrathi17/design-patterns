package design.patterns.creational.builder;

public class Demo {

  public static void main(String[] args) {
    Car car = new Car.CarBuilder()
              .num(4)
              .dimension(5)
              .build();
    car.show();
  }
}
