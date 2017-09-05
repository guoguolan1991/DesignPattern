package behaviorPattern.interpreterpattern;

/**
 * Created by Miller on 2017/9/5 0005.
 */
public class Constant extends Expression {

    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null & object instanceof Constant){
            return this.value == ((Constant)object).value;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }
}
