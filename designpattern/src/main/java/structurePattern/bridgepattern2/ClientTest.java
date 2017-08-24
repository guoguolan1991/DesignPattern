package structurePattern.bridgepattern2;

/**
 * Created by Miller on 2017/8/18 0018.
 */
public class ClientTest {
    public static void main(String[] args) {
        Bridge zhihao = new SuperMan("zhihao");

        zhihao.setSkill(new FireSkill());
        zhihao.StartSkill();

        zhihao.setSkill(new InvisibleSkill());
        zhihao.StartSkill();

        Bridge mengyi = new SuperMan("mengyi");
        mengyi.setSkill(new ElectricalSkill());
        mengyi.StartSkill();

        mengyi.setSkill(new InvisibleSkill());
        mengyi.StartSkill();
    }
}
