package behaviorPattern.interpreterpattern;

/**
 * Created by Miller on 2017/9/5 0005.
 */
public class ClientTest {
    public static void main(String[] args) {
        Context context = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant constant = new Constant(true);

        context.assign(x, false);
        context.assign(y, true);

        Expression expression = new Or(new And(constant, x), new And(y, new Not(x)));
        System.out.println("x=" + x.interpret(context));
        System.out.println("y=" + y.interpret(context));
        System.out.println(expression.toString() + "=" + expression.interpret(context));
    }
}
