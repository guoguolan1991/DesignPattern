package observerpattern3;


import java.util.Observable;

/**
 * Created by Miller on 2017/8/15 0015.
 */
public class Writer extends Observable{

    private String name;

    private String lastBook;

    public Writer(String name){
        super();
        this.name = name;
    }

    public void writeBook(String book){
        System.out.println(name + "写了新书：《" + book + "》");
        lastBook = book;
        setChanged();
        notifyObservers();
    }

    public String getLastBook(){
        return lastBook;
    }

    public String getName() {
        return name;
    }
}
