package design.patterns.creational.prototype;

/*
Create new objects by copying an existing object (prototype) instead of instantiating from scratch,
which is useful when object creation is expensive.

  - Avoids costly creation of objects (e.g., with heavy configuration or DB fetch).
  - Supports cloning complex objects with many states efficiently.
  - Allows dynamic object creation at runtime without coupling to specific classes.
  - Uses clone() or custom copy methods to perform shallow or deep copies.


In our example we used inheritance (Vehicle) because we have shared fields and logic (e.g., id, name).
*/

public class PrototypePatternDemo {
  public static void main(String[] args){
    CarVehicle car1 = new CarVehicle(1, "car1 name", 12);
    CarVehicle car2 = car1.clone();
    System.out.println(car2.name);

    BusVehicle bus1 = new BusVehicle(1, "bus1 name", "loud");
    BusVehicle bus2 = bus1.clone();
    System.out.println(bus2.name);
  }
}
