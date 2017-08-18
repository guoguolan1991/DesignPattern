package bridgepattern;

/**
 * Created by Miller on 2017/8/18 0018.
 */
public class ClientTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        Implementor implementorA = new ImplementorA();
        bridge.SetImplementor(implementorA);
        bridge.Operation();

        Implementor implementorB = new ImplementorB();
        bridge.SetImplementor(implementorB);
        bridge.Operation();
    }
}
