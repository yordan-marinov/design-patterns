package commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import recivers.Device;

@AllArgsConstructor
@Data
public class KitchenLightONCommand implements Command {

    private Device device;

    @Override
    public void execute() {
        device.on();
    }
}
