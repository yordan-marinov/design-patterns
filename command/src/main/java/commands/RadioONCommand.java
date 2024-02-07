package commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import recivers.Device;

@Data
@AllArgsConstructor
public class RadioONCommand implements Command {

    Device device;

    @Override
    public void execute() {
        device.on();
    }
}
