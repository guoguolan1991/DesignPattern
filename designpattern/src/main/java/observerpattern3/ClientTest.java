package observerpattern3;



/**
 * Created by Miller on 2017/8/15 0015.
 */
public class ClientTest {
    public static void main(String[] args) {
        Reader r1 = new Reader("徐祥");
        Reader r2 = new Reader("赵梦怡");

        Writer w1 = new Writer("志豪");
        Writer w2 = new Writer("schen");

        w1.addObserver(r1);
        w1.addObserver(r2);

        w2.addObserver(r1);

        w1.writeBook("Oh, My God");
        w2.writeBook("嘿哈，call me schen");
    }
}
