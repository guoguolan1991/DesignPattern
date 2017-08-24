package behaviorPattern.strategypattern;

/**
 * Created by Miller on 2017/8/10 0010.
 */
public class StrategyPatternTest {

    public static void main(String[] args) {

        // 选择需要使用的策略
        Strategy strategy = new ConcreteStrategyA();

        // 创建上下文环境
        Context context = new Context(strategy);

        context.doContext();
    }
}
