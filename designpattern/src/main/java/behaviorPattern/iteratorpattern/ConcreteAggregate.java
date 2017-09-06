package behaviorPattern.iteratorpattern;

/**
 * Created by Miller on 2017/9/6 0006.
 * 具体容器角色
 */
public class ConcreteAggregate implements List {
    private Object[] list;
    private int size = 0;
    private int index = 0;

    public ConcreteAggregate() {
        list = new Object[100];
        size = 0;
        index = 0;
    }

    public void add(Object object) {
        list[index++] = object;
        size++;
    }

    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    public Object get(int index) {
        return list[index];
    }

    public int getSize() {
        return size;
    }

}
