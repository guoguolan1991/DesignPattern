package behaviorPattern.chainpattern;

/**
 * Created by Miller on 2017/9/4 0004.
 */
public class ChainTest {
    public static void main(String[] args) {
        Handler h1 = new GeneralManager();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManager();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        System.out.println(h3.handleFeeRequest("zhihao", 400));
        System.out.println(h3.handleFeeRequest("凤姐", 800));
        System.out.println(h3.handleFeeRequest("徐凤年", 10000));
    }
}
