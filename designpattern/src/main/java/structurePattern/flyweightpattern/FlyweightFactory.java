package structurePattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miller on 2017/8/25 0025.
 */
public class FlyweightFactory {

    /**
     * a collection store all internal state
     */
    private Map<String, FlyWeight> map = new HashMap<String, FlyWeight>();

    public FlyWeight factory(String intrinsicState){
        FlyWeight flyWeight = map.get(intrinsicState);

        if(flyWeight == null){
            flyWeight = new ConcreteFlyWeight(intrinsicState);
            map.put(intrinsicState, flyWeight);
        }

        return flyWeight;
    }

    public int getFlyWeightSize(){
        return map.size();
    }
}
