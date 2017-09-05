package behaviorPattern.interpreterpattern;

/**
 * Created by Miller on 2017/9/5 0005.
 */
public abstract class Expression {
    public abstract boolean interpret(Context context);

    public  abstract boolean equals(Object object);

    public abstract int hashCode();

    public abstract String toString();
}
