package protoypepattern;

import java.util.ArrayList;

/**
 * Created by Miller on 2017/8/21 0021.
 */
public class Prototype implements Cloneable{
    private ArrayList list = new ArrayList();
    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
            prototype.list = (ArrayList)this.list.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return prototype;
    }

}
