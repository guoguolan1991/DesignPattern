package structurePattern.bridgepattern2;


/**
 * Created by Miller on 2017/8/18 0018.
 */
public abstract class Bridge {
    private Skill skill;

    private String name;

    public Bridge(String name) {
        this.name = name;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void StartSkill(){
        System.out.print(name + " ");
        skill.useSkill();
    }

}
