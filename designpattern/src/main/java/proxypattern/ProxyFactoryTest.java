package proxypattern;

/**
 * Created by Miller on 2017/8/14 0014.
 */
public class ProxyFactoryTest {
    public static void main(String[] args) {
        RealSubject2 realSubject2 = new RealSubject2();

        RealSubject2 proxy = (RealSubject2) new ProxyFactory(realSubject2).getProxyInstance();

        proxy.buyBook();
    }
}
