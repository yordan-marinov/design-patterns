package factoryMethod;

abstract public class VehicleFactory {

    public Vehicle getVehicle() {
        Vehicle vehicle = makeVehicle();
        vehicle.paint();
        vehicle.deliver();
        return vehicle;
    }

    abstract protected Vehicle makeVehicle();
}
