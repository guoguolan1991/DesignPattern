package behaviorPattern.interpreterpattern;

/**
 * Created by Miller on 2017/9/5 0005.
 */
public class Or extends Expression{
    private Expression left, right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null && object instanceof Or){
            return left.equals(((Or)object).left) && right.equals(((Or)object).right);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean interpret(Context context) {
        return left.interpret(context) || right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }
    
}
