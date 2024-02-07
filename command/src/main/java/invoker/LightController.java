package invoker;

import lombok.AllArgsConstructor;
import lombok.Data;
import commands.Command;

@Data
@AllArgsConstructor
public class LightController implements Controller {

    private Command command;

    @Override
    public void control() {
        command.execute();
    }
}
