package commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import recivers.Device;

@Data
@AllArgsConstructor
public class KitchenLightOFFCommand implements Command {

    private Device device;

    @Override
    public void execute() {
        device.off();
    }
}
