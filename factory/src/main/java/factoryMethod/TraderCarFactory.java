package factoryMethod;

public class TraderCarFactory extends VehicleFactory{
    @Override
    protected Vehicle makeVehicle() {
        return new TraderCar();
    }
}
