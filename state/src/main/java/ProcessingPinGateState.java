import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProcessingPinGateState implements CarParGateState {

    private final CarPark carPark;


    @Override
    public void enterPin(int pin) {
        if (1234 == pin) {
            System.out.println("Pin ok");
            System.out.println("Gate is opening");
            carPark.setGateState(carPark.getOpenedGateState());
        } else {
            System.out.println("Invalid pin");
            carPark.setGateState(carPark.getClosedGateState());
        }
    }

    @Override
    public void openGate() {
        carPark.setGateState(carPark.getOpenedGateState());
    }

    @Override
    public void closeGate() {
        carPark.setGateState(carPark.getClosedGateState());
    }
}
