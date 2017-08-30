package behaviorPattern.visitorpattern;

import com.sun.java.swing.plaf.motif.MotifEditorPaneUI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miller on 2017/8/30 0030.
 */
public class Presciption {

    List<Medicine> list = new ArrayList<Medicine>();
    public void accept(Visitor visitor){

        for (Medicine medicine : list){
            medicine.accept(visitor);
        }
    }

    public void addMedicine(Medicine medicine){
        list.add(medicine);
    }

    public void removeMedicine(Medicine medicine){
        list.remove(medicine);
    }
}
