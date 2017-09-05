package behaviorPattern.interpreterpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miller on 2017/9/5 0005.
 */
public class Context {

    public Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();

    public void assign(Variable variable, boolean value){
        map.put(variable, new Boolean(value));
    }

    public boolean lookup(Variable variable) throws IllegalArgumentException{
        Boolean value = map.get(variable);
        if(value == null){
            throw new IllegalArgumentException();
        }

        return value.booleanValue();
    }
}
