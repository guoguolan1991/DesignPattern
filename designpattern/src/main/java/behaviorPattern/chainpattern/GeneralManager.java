package behaviorPattern.chainpattern;

/**
 * Created by Miller on 2017/9/4 0004.
 * 总经理
 */
public class GeneralManager extends Handler{

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if(fee >= 1000){
            str = "成功：总经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
        }else{
            if(getSuccessor() != null){
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return str;
    }
}
