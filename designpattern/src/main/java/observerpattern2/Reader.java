package observerpattern2;

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

    /**
     * 根据名字关注某个人
     * @param writerName
     */
    public void subscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    /**
     * 根据名字取消关注某人
     * @param writerName
     */
    public void unsubscribe(String writerName){
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

}
