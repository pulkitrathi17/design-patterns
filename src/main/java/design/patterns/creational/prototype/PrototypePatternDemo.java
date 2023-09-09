package design.patterns.creational.prototype;

public class PrototypePatternDemo {
  public static void main(String[] args){
    CarVehicle car1 = new CarVehicle();
    car1.name = "car1 name";
    car1.id = 1;
    car1.trunkSize = 12;
    
    Vehicle car2 = car1.clone();
    System.out.println(car2.name);
  }
}
