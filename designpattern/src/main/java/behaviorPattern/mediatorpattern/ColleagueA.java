package behaviorPattern.mediatorpattern;

/**
 * Created by Miller on 2017/8/28 0028.
 */
public class ColleagueA extends Colleague{

    public ColleagueA(String name, Mediator mediator){
        super(name, mediator);
    }

    public void getMessage(String message){
        System.out.println("colleagueA " + name +" get message: " + message);
    }

    public void contact(String message){
        mediator.contact(message, this);
    }

}
