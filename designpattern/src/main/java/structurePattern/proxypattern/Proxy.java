package structurePattern.proxypattern;

/**
 * Created by Miller on 2017/8/14 0014.
 * 代理类
 */
public class Proxy implements Subject{

    Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void buyBook(){
        subject.buyBook();
    }
}
