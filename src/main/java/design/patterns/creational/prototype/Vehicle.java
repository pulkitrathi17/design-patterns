package design.patterns.creational.prototype;

public abstract class Vehicle{
    Integer id;
    String name;

    public Vehicle(){ }

    public Vehicle(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Vehicle(Vehicle vehicle){
      this.id = vehicle.id;
      this.name = vehicle.name;
    }

    public abstract Vehicle clone();
}
