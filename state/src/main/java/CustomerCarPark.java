public class CustomerCarPark {

    public static void main(String[] args) {
        final CarPark carPark = new CarPark();
        carPark.getIn(123);  // Invalid pin the default PIN is 1234
        carPark.getIn(1234);  // Valid pin
        carPark.getIn(1234);  // The car is already inside

        carPark.getOut();  // Gate is closing
        carPark.getOut();  // Gate is already closed
    }
}
