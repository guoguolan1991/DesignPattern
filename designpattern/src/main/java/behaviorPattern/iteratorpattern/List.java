package behaviorPattern.iteratorpattern;

/**
 * Created by Miller on 2017/9/6 0006.
 */
public interface List {

    public void add(Object object);
    public Object get(int index);
    public Iterator iterator();
    public int getSize();
}
