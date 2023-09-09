package design.patterns.creational.prototype;

public class CarVehicle extends Vehicle {

  public Integer trunkSize;

  public CarVehicle(){ }

  public CarVehicle(CarVehicle carVehicle) {
    super(carVehicle);
    this.trunkSize = carVehicle.trunkSize;
  }

  @Override
  public CarVehicle clone() {
    return new CarVehicle(this);
  }
}
