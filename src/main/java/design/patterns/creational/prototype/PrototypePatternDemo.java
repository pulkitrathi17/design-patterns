package design.patterns.creational.prototype;

/*
Create new objects by copying an existing object (prototype) instead of instantiating from scratch,
which is useful when object creation is expensive.

  - Avoids costly creation of objects (e.g., with heavy configuration or DB fetch).
  - Allows dynamic object creation at runtime without coupling to specific classes.
  - Uses clone() or custom copy methods to perform shallow or deep copies.
  - Helps in cloning when some fields are private and only class methods can access them.

Usual way of implementing this pattern:
  - To have a method clone() that returns an object of class type and call the constructor with `this` argument.
  - The class should have a constructor that receives object of same class as argument to copy the object fields

In our example we used inheritance (Vehicle) because we have shared fields and logic (e.g., id, name).
*/

import java.util.ArrayList;
import java.util.List;

public class PrototypePatternDemo {
  public static void main(String[] args){
    CarVehicle car = new CarVehicle(1, "car name", 12);
    BusVehicle bus = new BusVehicle(1, "bus name", "loud");

    List<Vehicle> vehicleList = List.of(car, bus);
    List<Vehicle> copyVehicleList = new ArrayList<>();

    // we are able to clone the whole list of different Vehicle child class
    // without implementing whole cloning logic for each class
    for(Vehicle vehicle : vehicleList){
      copyVehicleList.add(vehicle.clone());
    }

    for(Vehicle vehicle : copyVehicleList){
      System.out.println(vehicle.name);
    }
  }
}
