package behaviorPattern.commandpattern;

/**
 * Created by Miller on 2017/9/7 0007.
 */
public class ClientTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}
