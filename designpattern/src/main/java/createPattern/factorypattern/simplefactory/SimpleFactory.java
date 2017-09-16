package createPattern.factorypattern.simplefactory;

/**
 * Created by Miller on 2017/9/16 0016.
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = null;
        try {
            car = driver.createCar("benz");
        } catch (Exception e) {
            e.printStackTrace();
        }
        car.setName("benz");
        car.drive();
    }
}

/**
 * 抽象产品
 */
abstract class Car{
    private String name;
    public abstract void drive();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Benz extends Car {
    @Override
    public void drive() {
        System.out.println(this.getName() + ": ---------------go----------------");
    }
}

class BMW extends Car {
    @Override
    public void drive() {
        System.out.println(this.getName() + ": ---------------go----------------");
    }
}

class Driver{
    public static Car createCar(String car){
        Car c = null;
        if("benz".equalsIgnoreCase(car)){
            return new Benz();
        }else if ("bmw".equalsIgnoreCase(car)){
            return new BMW();
        }

        return c;
    }
}