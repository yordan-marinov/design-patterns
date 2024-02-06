package factoryMethod;

public class FamilyCarFactory extends VehicleFactory{
    @Override
    protected Vehicle makeVehicle() {
        return new FamilyCar();
    }
}
