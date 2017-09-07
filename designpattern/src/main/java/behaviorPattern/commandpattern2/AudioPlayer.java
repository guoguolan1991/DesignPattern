package behaviorPattern.commandpattern2;

/**
 * Created by Miller on 2017/9/7 0007.
 * 接收者角色，由录音机扮演
 */
public class AudioPlayer {

    public void play(){
        System.out.println("play");
    }

    public void rewind(){
        System.out.println("rewind");
    }

    public void stop(){
        System.out.println("stop");
    }
}
