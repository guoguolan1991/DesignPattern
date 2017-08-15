package adapterpattern;

/**
 * Created by Miller on 2017/8/15 0015.
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adapter = new ObjectAdapter(new Adaptee());
        adapter.request();
    }
}
