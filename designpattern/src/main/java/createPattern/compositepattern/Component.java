package createPattern.compositepattern;

/**
 * Created by Miller on 2017/8/24 0024.
 */
public abstract class Component {
    String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void foreach();

}
