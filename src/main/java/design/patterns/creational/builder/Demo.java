package design.patterns.creational.builder;

import design.patterns.creational.builder.Car.CarBuilder;

public class Demo {

  public static void main(String[] args) {
    Car car = Car.CarBuilder.newInstance()
              .num(4)
              .dimension(5)
              .build();
    car.show();
  }
}
