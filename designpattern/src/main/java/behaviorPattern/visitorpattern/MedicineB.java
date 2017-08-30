package behaviorPattern.visitorpattern;

/**
 * Created by Miller on 2017/8/30 0030.
 */
public class MedicineB extends Medicine{
    public MedicineB(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
