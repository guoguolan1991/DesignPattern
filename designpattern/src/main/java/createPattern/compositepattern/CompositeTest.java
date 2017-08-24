package createPattern.compositepattern;

/**
 * Created by Miller on 2017/8/24 0024.
 */
public class CompositeTest {
    public static void main(String[] args) {
        Component component = new Composite("根节点");
        Component child = new Composite("第一级子节点child");
        Component child_1 = new Leaf("第一级子节点->leaf1");
        Component child_2 = new Leaf("第一级子节点->leaf2");
        child.add(child_1);
        child.add(child_2);
        Component child2 = new Composite("第一级子节点child2");
        component.add(child);
        component.add(child2);
        component.foreach();
    }
}
