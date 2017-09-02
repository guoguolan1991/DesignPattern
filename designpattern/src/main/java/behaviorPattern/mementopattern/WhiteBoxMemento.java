package behaviorPattern.mementopattern;

/**
 * Created by Miller on 2017/9/2 0002.
 */


public class WhiteBoxMemento {
    public static void main(String[] args) {

        Origintor o = new Origintor();
        Caretaker c = new Caretaker();

        o.setState("On");

        c.saveMemento(o.createMemento());

        o.setState("off");

        o.restoreMemento(c.retrieveMemento());

        System.out.println(o.getState());

    }

}

