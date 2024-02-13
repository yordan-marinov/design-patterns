import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ClosedGateState implements CarParGateState {

    private final CarPark carPark;

    @Override
    public void enterPin(int pin) {
//        carPark.setGateState(carPark.getProcessingPinGateState());
        carPark.getProcessingPinGateState().enterPin(pin);
    }

    @Override
    public void openGate() {
        System.out.println("Opening Gate");
        carPark.setGateState(carPark.getOpenedGateState());
    }

    @Override
    public void closeGate() {
        System.out.println("Gate is closed already");
    }
}
