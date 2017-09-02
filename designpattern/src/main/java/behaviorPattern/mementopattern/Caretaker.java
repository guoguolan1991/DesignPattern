package behaviorPattern.mementopattern;

/**
 * Created by Miller on 2017/9/2 0002.
 * 负责人角色，负责保存备忘录对象，但是不修改、查看备忘录对象的内容
 */
public class Caretaker {

    private Memento memento;

    public Memento retrieveMemento(){
        return this.memento;
    }

    public void saveMemento(Memento memento){
        this.memento = memento;
    }

}
