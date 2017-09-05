package behaviorPattern.interpreterpattern;

/**
 * Created by Miller on 2017/9/5 0005.
 */
public class Variable extends Expression{

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if(object != null && object instanceof Variable){
            return this.name.equals(((Variable)object).name);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean interpret(Context context) {
        return context.lookup(this);
    }
}
