package behaviorPattern.strategypattern;

/**
 * Created by Miller on 2017/8/10 0010.
 */
public class Context {

    /**
     * 具体的策略对象
     */
    private Strategy strategy;

    /**
     * @param strategy 具体的策略对象
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 执行策略方法
     */
    public void doContext(){
        strategy.doStrategy();
    }

}
