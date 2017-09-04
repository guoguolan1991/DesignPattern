package behaviorPattern.chainpattern;

/**
 * Created by Miller on 2017/9/4 0004.
 * 抽象处理角色
 */
public abstract class Handler {

    /**
     * next request handler
     */
    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract String handleFeeRequest(String user, double fee);

}
