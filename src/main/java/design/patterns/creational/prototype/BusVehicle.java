package design.patterns.creational.prototype;

public class BusVehicle extends Vehicle {

    public String hornType;

    public BusVehicle(){ }

    public BusVehicle(Integer id, String name, String hornType){
        super(id, name);
        this.hornType = hornType;
    }

    public BusVehicle(BusVehicle busVehicle) {
        super(busVehicle);
        this.hornType = busVehicle.hornType;
    }

    @Override
    public BusVehicle clone() {
        return new BusVehicle(this);
    }
}