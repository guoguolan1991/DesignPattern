package behaviorPattern.templatepattern;

/**
 * Created by Miller on 2017/8/29 0029.
 * 货币市场(Money Market)账号
 */
public class MoneyMarketAccount extends Account{

    @Override
    protected String doCalculateAccounttype() {
        return "Money market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.032;
    }
}
