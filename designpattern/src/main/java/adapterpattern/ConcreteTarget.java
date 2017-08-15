package adapterpattern;

/**
 * Created by Miller on 2017/8/15 0015.
 */
public class ConcreteTarget implements Target{
    public void request(){
        System.out.println("普通类执行普通功能");
    }
}
