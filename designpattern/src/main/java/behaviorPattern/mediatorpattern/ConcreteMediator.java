package behaviorPattern.mediatorpattern;

/**
 * Created by Miller on 2017/8/28 0028.
 */
public class ConcreteMediator extends Mediator{

    ColleagueA colleagueA;
    ColleagueB colleagueB;

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void contact(String contact, Colleague colleague) {
        if(colleague == colleagueA){
            colleagueB.getMessage(contact);
        }else{
            colleagueA.getMessage(contact);
        }
    }
}
