package behaviorPattern.visitorpattern;

/**
 * Created by Miller on 2017/8/30 0030.
 */
public class Charger extends Visitor{

    @Override
    public void visitor(MedicineA medicineA) {
        System.out.println("划价员" + name + "给药" + medicineA.getName() + "划价: " + medicineA.getPrice());
    }

    @Override
    public void visitor(MedicineB medicineB) {
        System.out.println("划价员" + name + "给药" + medicineB.getName() + "划价: " + medicineB.getPrice());
    }
}
