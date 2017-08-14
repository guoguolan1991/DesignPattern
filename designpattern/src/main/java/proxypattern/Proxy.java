package proxypattern;

/**
 * Created by Miller on 2017/8/14 0014.
 * 代理类
 */
public class Proxy implements Subject{

    public void buyBook(){
        RealSubject subject = new RealSubject();
        subject.buyBook();
    }
}
