package behaviorPattern.iteratorpattern;

/**
 * Created by Miller on 2017/9/6 0006.
 */
public class ClientTest {
    public static void main(String[] args) {
        List list = new ConcreteAggregate();
        list.add("aaa");
        list.add("2222");
        list.add("ggg");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
