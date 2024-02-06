package factoryMethod;

abstract public class VehicleFactory {

    public Vehicle getVehicle() {
        Vehicle vehicle = makeVehicle();
        vehicle.pain();
        vehicle.deliver();
        return vehicle;
    }

    abstract protected Vehicle makeVehicle();
}
