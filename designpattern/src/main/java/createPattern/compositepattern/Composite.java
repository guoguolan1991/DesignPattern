package createPattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miller on 2017/8/24 0024.
 */
public class Composite extends Component{

    private List<Component> child = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }

    @Override
    public void remove(Component component) {
        child.remove(component);
    }

    @Override
    public void foreach() {
        System.out.println("node name:" + this.name);
        for(Component component : child){
            component.foreach();
        }
    }
}
