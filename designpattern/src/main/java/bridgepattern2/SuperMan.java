package bridgepattern2;

/**
 * Created by Miller on 2017/8/18 0018.
 */
public class SuperMan extends Bridge{

    public SuperMan(String name) {
        super(name);
    }

    public void useOtherSkill(){
        System.out.println("use other skill");
    }

}
