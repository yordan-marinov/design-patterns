package factoryMethod;

abstract public class Vehicle {

    private final String type;
    private final String fuelType;
    private final double price;

    protected Vehicle(String type, String fuelType, double price) {
        this.type = type;
        this.fuelType = fuelType;
        this.price = price;
    }

    public void pain() {
        System.out.println(
                String.format("Painting the vehicle type: %s, fuel: %s, price: $%S",
                        this.type,
                        this.fuelType,
                        this.price
                )
        );
    }

    public void deliver() {
        System.out.println("Good news! You're vehicle is been shipped.");
    }

    public void drive() {
        System.out.println("Its so fun to drive my new vehicle :D");
    }
}
