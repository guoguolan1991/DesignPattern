package createPattern.factorypattern.factorymethod;

/**
 * Created by Miller on 2017/9/16 0016.
 */



public class FactoryMethod {

    public static void main(String[] args) {
        Driver driver = new BenzDriver();
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

class Benz extends Car{
    @Override
    public void drive() {
        System.out.println(this.getName() + ": ---------------go----------------");
    }
}

class BMW extends Car{
    @Override
    public void drive() {
        System.out.println(this.getName() + ": ---------------go----------------");
    }
}

/**
 * 抽象工厂
 */
abstract class Driver{
    public abstract Car createCar(String car) throws Exception;
}

class BenzDriver extends Driver{
    @Override
    public Car createCar(String car) throws Exception {
        return new Benz();
    }
}

class BMWDriver extends Driver{
    @Override
    public Car createCar(String car) throws Exception {
        return new BMW();
    }
}