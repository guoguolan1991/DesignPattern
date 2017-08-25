package structurePattern.flyweightpattern;

/**
 * Created by Miller on 2017/8/24 0024.
 * abstract flyweight object
 */

public interface FlyWeight {
    /**
     *
     * @param state is external state
     */
    void operation(String state);
}
