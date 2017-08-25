package structurePattern.flyweightpattern;

/**
 * Created by Miller on 2017/8/25 0025.
 */
public class ClientTest {
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        FlyWeight flyWeight = factory.factory(new String("辣椒炒肉"));
        flyWeight.operation("黄晓明点菜");

        FlyWeight flyWeight2 = factory.factory(new String("牛肉"));
        flyWeight2.operation("AB点菜");

        FlyWeight flyWeight3 = factory.factory(new String("辣椒炒肉"));
        flyWeight3.operation("黄晓明点菜");

        System.out.println(flyWeight == flyWeight3);
        System.out.println("size:" + factory.getFlyWeightSize());
    }
}
