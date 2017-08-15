package adapterpattern;

/**
 * Created by Miller on 2017/8/15 0015.
 * 对象适配器类
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        this.adaptee.spectficRequest();
    }
}
