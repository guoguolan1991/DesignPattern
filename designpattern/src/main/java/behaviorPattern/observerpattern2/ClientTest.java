package behaviorPattern.observerpattern2;

/**
 * Created by Miller on 2017/8/15 0015.
 */
public class ClientTest {
    public static void main(String[] args) {
        Reader r1 = new Reader("徐祥");
        Reader r2 = new Reader("赵梦怡");

        Writer w1 = new Writer("志豪");
        Writer w2 = new Writer("schen");

        r1.subscribe("志豪");
        r2.subscribe("志豪");
        r2.subscribe("schen");

        w1.writeBook("请大家爱我");
        w2.writeBook("哈哈哈，请叫我陈帅");
    }
}
