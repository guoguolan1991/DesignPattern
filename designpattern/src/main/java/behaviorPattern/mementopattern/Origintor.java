package behaviorPattern.mementopattern;

/**
 * Created by Miller on 2017/9/2 0002.
 * 发起人角色
 */
public class Origintor {

    private String state;

    /**
     * 工厂方法
     * @return
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象记载的状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }
}
