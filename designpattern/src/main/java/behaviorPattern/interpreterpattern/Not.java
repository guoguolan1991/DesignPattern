package behaviorPattern.interpreterpattern;

/**
 * Created by Miller on 2017/9/5 0005.
 */
public class Not extends Expression {

    private Expression expression;

    public Not(Expression expression){
        this.expression = expression;
    }
    @Override
    public boolean equals(Object object) {
        if(object != null && object instanceof Not)
        {
            return expression.equals(
                    ((Not)object).expression);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean interpret(Context context) {
        return !expression.interpret(context);
    }

    @Override
    public String toString() {
        return "(Not " + expression.toString() + ")";
    }

}
