package behaviorPattern.mementopattern;

/**
 * Created by Miller on 2017/9/2 0002.
 * 备忘录角色 将发起人传入的状态存储起来
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
