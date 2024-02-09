public class AdapterMain {

    public static void main(String[] args) {
        Car familyCar = new FamilyCar("Volvo", "V70");
        Motorcycle touringBike = new TouringMotorcycle("Yamaha", "Tracer");

        System.out.println("\n\tDriving my good old Volvo :)");

        familyCar.getIn();
        familyCar.start();
        familyCar.drive();
        familyCar.park();

        System.out.println("\n\tRiding my Touring Yamaha");

        touringBike.getOn();
        touringBike.start();
        touringBike.ride();
        touringBike.stop();

        System.out.println("\n\tDriving bike like a car thanks to the adapter");

        Car carBikeLike = new CarToBikeAdapter(new TouringMotorcycle("Triumph", "Explorer"));
        carBikeLike.getIn();
        carBikeLike.start();
        carBikeLike.drive();
        carBikeLike.park();
    }
}
