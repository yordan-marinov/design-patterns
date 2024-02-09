import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarToBikeAdapter implements Car {

    private Motorcycle motorcycle;

    @Override
    public void getIn() {
        motorcycle.getOn();
    }

    @Override
    public void start() {
        motorcycle.start();
    }

    @Override
    public void drive() {
        motorcycle.ride();
    }

    @Override
    public void park() {
        motorcycle.stop();
    }
}
