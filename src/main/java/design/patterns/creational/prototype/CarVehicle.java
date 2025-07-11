package design.patterns.creational.prototype;

public class CarVehicle extends Vehicle {

  public Integer trunkSize;

  public CarVehicle(){ }

  public CarVehicle(Integer id, String name, Integer trunkSize){
    super(id, name);
    this.trunkSize = trunkSize;
  }

  public CarVehicle(CarVehicle carVehicle) {
    super(carVehicle);
    this.trunkSize = carVehicle.trunkSize;
  }

  @Override
  public CarVehicle clone() {
    return new CarVehicle(this);
  }
}
