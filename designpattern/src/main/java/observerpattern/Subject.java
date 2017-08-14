package observerpattern;

/**
 * Created by Miller on 2017/8/9 0009.
 */

/**
 * 主题，被观察者
 */
public interface Subject<T extends Observer> {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(T observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(T observer);

    /**
     * 通知所有注册的观察者
     */
    void notifyobservers();
}
