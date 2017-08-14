package proxypattern;

/**
 * Created by Miller on 2017/8/14 0014.
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        Subject target = new RealSubject();
        Subject subject = new Proxy(target);
        subject.buyBook();
    }
}
