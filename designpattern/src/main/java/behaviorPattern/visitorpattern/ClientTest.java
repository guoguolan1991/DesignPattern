package behaviorPattern.visitorpattern;

/**
 * Created by Miller on 2017/8/30 0030.
 */
public class ClientTest {
    public static void main(String[] args) {
        Medicine a = new MedicineA("板蓝根", 12.0);
        Medicine b = new MedicineB("999感冒灵", 32.5);

        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);

        Visitor charger = new Charger();
        charger.setName("梦入神机");

        Visitor workerOfPharmacy = new WorkerOfPharmacy();
        workerOfPharmacy.setName("天下霸唱");

        presciption.accept(charger);
        System.out.println("##############################################");
        presciption.accept(workerOfPharmacy);
    }
}
