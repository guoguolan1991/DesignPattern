package behaviorPattern.templatepattern;

/**
 * Created by Miller on 2017/8/29 0029.
 * 定期存款(Certificate of Deposite)账号
 */
public class CDAccount extends Account{
    @Override
    protected String doCalculateAccounttype() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
