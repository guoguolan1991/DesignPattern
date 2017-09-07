package behaviorPattern.commandpattern;

/**
 * Created by Miller on 2017/9/7 0007.
 */
public class ConcreteCommand implements Command {

    /**
     * 相应的接受者对象
     */
    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
