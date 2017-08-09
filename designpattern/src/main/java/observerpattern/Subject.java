package observerpattern;

/**
 * Created by Miller on 2017/8/9 0009.
 */

/**
 * 主题，被观察者
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有注册的观察者
     */
    void notifyobservers();
}
