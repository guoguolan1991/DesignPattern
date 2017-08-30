package behaviorPattern.visitorpattern;

/**
 * Created by Miller on 2017/8/30 0030.
 */
public abstract class Visitor {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visitor(MedicineA medicineA);
    public abstract void visitor(MedicineB medicineB);

}
