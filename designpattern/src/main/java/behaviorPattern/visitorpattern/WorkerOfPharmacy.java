package behaviorPattern.visitorpattern;

/**
 * Created by Miller on 2017/8/30 0030.
 */
public class WorkerOfPharmacy extends Visitor{

    @Override
    public void visitor(MedicineA medicineA) {
        System.out.println("药房工作者" + name + "拿药：" + medicineA.getName());
    }

    @Override
    public void visitor(MedicineB medicineB) {
        System.out.println("药房工作者" + name + "拿药：" + medicineB.getName());
    }
}
