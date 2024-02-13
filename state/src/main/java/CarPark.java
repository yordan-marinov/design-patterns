import lombok.Getter;
import lombok.Setter;

@Getter
public class CarPark {
    private final OpenedGateState openedGateState;
    private final ClosedGateState closedGateState;
    private final ProcessingPinGateState processingPinGateState;
    @Setter
    private CarParkGateState gateState;

    public CarPark() {
        this.openedGateState = new OpenedGateState(this);
        this.closedGateState = new ClosedGateState(this);
        this.processingPinGateState = new ProcessingPinGateState(this);

        this.gateState = this.closedGateState;
    }

    public void getIn(int pin) {
        gateState.enterPin(pin);
    }

    public void getOut() {
        gateState.closeGate();
    }

}
