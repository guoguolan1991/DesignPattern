package structurePattern.adapterpattern;

/**
 * Created by Miller on 2017/8/15 0015.
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target{
    public void request(){
        super.spectficRequest();
    }
}
