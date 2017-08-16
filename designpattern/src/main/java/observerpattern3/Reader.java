package observerpattern3;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Miller on 2017/8/15 0015.
 */
public class Reader implements Observer {
    private String name;

    public Reader(String name){
        super();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void update(Observable observable, Object object) {
        if(observable instanceof Observable){
            Writer writer = (Writer) observable;
            System.out.println(name + "收到了" + writer.getName() + "写了新书《" + writer.getLastBook() + "》");
        }
    }


}
