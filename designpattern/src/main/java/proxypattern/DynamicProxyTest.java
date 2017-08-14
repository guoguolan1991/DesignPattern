package proxypattern;

/**
 * Created by Miller on 2017/8/14 0014.
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject();

        System.out.println(subject.getClass());

        // create proxy object for target object
        Subject proxy = (Subject) new DynamicProxy(subject).getProxyInstance();

        System.out.println(proxy.getClass());

        proxy.buyBook();
    }
}
