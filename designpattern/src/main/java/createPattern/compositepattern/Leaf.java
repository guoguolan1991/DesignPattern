package createPattern.compositepattern;

/**
 * Created by Miller on 2017/8/24 0024.
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void foreach() {
        System.out.println("leaf name: " + this.name);
    }
}
