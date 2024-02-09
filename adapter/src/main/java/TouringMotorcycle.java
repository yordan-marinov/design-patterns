import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TouringMotorcycle implements Motorcycle {

    private String make;
    private String model;

    @Override
    public void getOn() {
        System.out.println("Getting on " + this.getClass().getSimpleName().toUpperCase());
    }

    @Override
    public void start() {
        System.out.println("Starting " + this.getClass().getSimpleName().toUpperCase());
    }

    @Override
    public void ride() {
        System.out.println("Riding " + this.getClass().getSimpleName().toUpperCase());
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + this.getClass().getSimpleName().toUpperCase());
    }

}
