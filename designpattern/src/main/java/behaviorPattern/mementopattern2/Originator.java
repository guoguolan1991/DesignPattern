package behaviorPattern.mementopattern2;

import behaviorPattern.mementopattern.Memento;

/**
 * Created by Miller on 2017/9/2 0002.
 * 发起人角色类Originator中定义了一个内部的Memento类。
 * 由于此Memento类的全部接口都是私有的，因此只有它自己和发起人类可以调用。
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }

    public MementoIF createMemento(){
        return  new Memento(state);
    }

    public void restoreMemento(MementoIF memento){
        this.setState(((Memento)memento).getState());
    }

    private class Memento implements MementoIF{
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
}
