package behaviorPattern.templatepattern;

/**
 * Created by Miller on 2017/8/29 0029.
 */
public class clientTest {
    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号利息数额：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号利息数额：" + account.calculateInterest());
    }
}
