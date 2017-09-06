package behaviorPattern.iteratorpattern;

/**
 * Created by Miller on 2017/9/6 0006.
 */
public class ConcreteIterator implements Iterator {

    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    public boolean hasNext() {
        if(index >= list.getSize()){
            return false;
        }else{
            return true;
        }
    }

    public Object next(){
        Object object = list.get(index);
        index++;
        return object;
    }
}
