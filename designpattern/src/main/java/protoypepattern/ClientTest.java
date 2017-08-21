package protoypepattern;

/**
 * Created by Miller on 2017/8/21 0021.
 */
public class ClientTest {
    public static void main(String[] args) {
        ConcreteProtoType concreteProtoType = new ConcreteProtoType();
        for (int i = 0; i < 5; i++) {
            ConcreteProtoType clonecp = (ConcreteProtoType)concreteProtoType.clone();
            clonecp.show();
        }
    }
}
