package proxypattern;

/**
 * Created by Miller on 2017/8/14 0014.
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.buyBook();
    }
}
