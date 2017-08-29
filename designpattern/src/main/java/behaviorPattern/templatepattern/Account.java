package behaviorPattern.templatepattern;

/**
 * Created by Miller on 2017/8/29 0029.
 */
public abstract class Account {

    /**
     * 模板方法，计算利息数额
     * @return
     */
    public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccounttype();
        double amount = calculateAmount(accountType);
        return amount * interestRate;
    }

    /**
     * 基本方法留给子类实现
     */
    protected abstract double doCalculateInterestRate();

    /**
     * 基本方法留给子类实现
     */
    protected abstract String doCalculateAccounttype();

    /**
     * 基本方法已经实现（concreteMethod）
     * @param accoutType
     * @return
     */
    private double calculateAmount(String accoutType){
        return 777.00;
    }
}
