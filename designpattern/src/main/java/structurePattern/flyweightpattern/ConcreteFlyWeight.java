package structurePattern.flyweightpattern;

/**
 * Created by Miller on 2017/8/24 0024.
 * concrete flyweight object
 */
public class ConcreteFlyWeight implements FlyWeight{

    /**
     * internal state
     */
    private String intrinsicState = null;

    public ConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operation(String state) {
        System.out.println("internal state: " + this.intrinsicState);
        System.out.println("external state: " + state);
    }
}
