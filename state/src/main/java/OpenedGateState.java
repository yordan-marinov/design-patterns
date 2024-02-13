import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OpenedGateState implements CarParkGateState {

    private final CarPark carPark;

    @Override
    public void enterPin(int pin) {
        System.out.println("Processing Pin " + pin);
        if (carPark.getGateState().equals(carPark.getOpenedGateState())) {
            openGate();
        }
    }

    @Override
    public void openGate() {
        System.out.println("Gate is opened already");
    }

    @Override
    public void closeGate() {
        System.out.println("Gate is closing");
        carPark.setGateState(carPark.getClosedGateState());
    }
}
