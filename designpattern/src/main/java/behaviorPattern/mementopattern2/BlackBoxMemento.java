package behaviorPattern.mementopattern2;

/**
 * Created by MIller on 2017/9/2 0002.
 */
public class BlackBoxMemento {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();

        o.setState("open");

        c.saveMemento(o.createMemento());

        o.setState("close");

        o.restoreMemento(c.retrieveMemento());

        System.out.println(o.getState());
    }
}
