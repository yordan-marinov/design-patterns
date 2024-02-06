package factoryMethod;

public class SportCarFactory extends VehicleFactory{

    @Override
    protected Vehicle makeVehicle() {
        return new SportCar();
    }
}
