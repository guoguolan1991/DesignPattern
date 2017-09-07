package behaviorPattern.commandpattern;

/**
 * Created by Miller on 2017/9/7 0007.
 * 请求者角色类
 */
public class Invoker {

    /**
     * 持有的命令对象
     */
    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }

}
