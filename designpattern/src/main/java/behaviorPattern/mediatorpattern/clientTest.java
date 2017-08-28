package behaviorPattern.mediatorpattern;

/**
 * Created by Miller on 2017/8/28 0028.
 */
public class clientTest {
    public static void main(String[] args) {
        // define mediator
        ConcreteMediator mediator = new ConcreteMediator();

        // define concrete colleague
        ColleagueA colleagueA = new ColleagueA("Miller", mediator);
        ColleagueB colleagueB = new ColleagueB("Denny", mediator);

        // mediator need to know every colleague
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.contact("hi, I am Miller");
        colleagueB.contact("hi, I am Denny");
    }
}
