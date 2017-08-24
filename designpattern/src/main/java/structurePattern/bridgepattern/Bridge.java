package structurePattern.bridgepattern;

/**
 * Created by Miller on 2017/8/18 0018.
 */
public abstract class Bridge {
    private Implementor implementor;

    public void SetImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void Operation(){
        implementor.OperationImpl();
    }
}
