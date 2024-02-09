import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FamilyCar implements Car {

    private String make;
    private String model;


    @Override
    public void getIn() {
        System.out.println("Getting in " + this.getClass().getSimpleName().toUpperCase());
    }

    @Override
    public void start() {
        System.out.println("Starting the " + this.getClass().getSimpleName().toUpperCase());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + this.getClass().getSimpleName().toUpperCase());
    }

    @Override
    public void park() {
        System.out.println("Parking the " + this.getClass().getSimpleName().toUpperCase());
    }

}
