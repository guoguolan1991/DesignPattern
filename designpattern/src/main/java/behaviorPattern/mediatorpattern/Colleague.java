package behaviorPattern.mediatorpattern;

/**
 * Created by Miller on 2017/8/28 0028.
 */
public class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
