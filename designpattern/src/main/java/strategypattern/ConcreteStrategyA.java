package strategypattern;

/**
 * Created by Miller on 2017/8/10 0010.
 * 具体的策略类A
 */
public class ConcreteStrategyA implements Strategy{

    public void doStrategy(){
        System.out.println("execute algorithm A");
    }
}
