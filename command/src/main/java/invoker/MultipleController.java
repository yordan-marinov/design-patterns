package invoker;

import lombok.AllArgsConstructor;
import lombok.Data;
import commands.Command;

import java.util.List;

@Data
@AllArgsConstructor
public class MultipleController implements Controller {

    private List<Command> commands;
    @Override
    public void control() {
        commands.forEach(Command::execute);
    }
}
