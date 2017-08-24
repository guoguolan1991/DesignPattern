package structurePattern.proxypattern;

/**
 * Created by Miller on 2017/8/14 0014.
 * 具体执行业务的类
 */
public class RealSubject implements Subject{

    public void buyBook(){
        System.out.println("buy book.");
    }
}
