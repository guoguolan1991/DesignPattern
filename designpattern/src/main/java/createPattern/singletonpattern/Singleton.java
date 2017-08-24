package createPattern.singletonpattern;

/**
 * Created by Miller on 2017/8/9 0009.
 * 单例模式
 */

/**
 * 懒汉模式
 */
//public class Singleton {
//    private static Singleton instance;
//
//    public Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//
//        return instance;
//    }
//}

/**
 * 饿汉模式
 */
//public class Singleton {
//    private static Singleton instance = new Singleton();
//    private Singleton (){}
//    public static Singleton getInstance() {
//        return instance;
//    }
//}

/**
 * 静态内部类的方式
 */
//public class Singleton {
//    private static class SingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    private Singleton (){}
//    public static final Singleton getInstance() {
//        return SingletonHolder.INSTANCE;
//    }
//}

/**
 * 双重校验锁
 */
public class Singleton{
    private volatile static Singleton singleton;

    public  static Singleton getSingleton(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}