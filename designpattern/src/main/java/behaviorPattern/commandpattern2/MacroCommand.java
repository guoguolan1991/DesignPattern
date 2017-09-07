package behaviorPattern.commandpattern2;

/**
 * Created by Miller on 2017/9/7 0007.
 * 宏命令接口
 */
public interface MacroCommand extends Command{

    public void add(Command command);

    public void remove(Command command);

}
