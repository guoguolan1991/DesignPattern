package behaviorPattern.commandpattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miller on 2017/9/7 0007.
 * 具体宏命令聚集类
 */
public class MacroAudioCommand implements MacroCommand{
    private List<Command> commandList = new ArrayList<Command>();

    public void add(Command command) {
        commandList.add(command);
    }

    public void remove(Command command) {
        commandList.remove(command);
    }

    public void execute() {
        for(Command command : commandList){
            command.execute();
        }
    }
}
