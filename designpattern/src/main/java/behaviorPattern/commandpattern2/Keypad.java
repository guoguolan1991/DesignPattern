package behaviorPattern.commandpattern2;

/**
 * Created by Miller on 2017/9/7 0007.
 * 请求者角色，键盘
 */
public class Keypad {

    private Command playCommand;
    private Command rewindCommad;
    private Command stopCommad;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommad(Command rewindCommad) {
        this.rewindCommad = rewindCommad;
    }

    public void setStopCommad(Command stopCommad) {
        this.stopCommad = stopCommad;
    }

    public void play(){
        playCommand.execute();
    }

    public void rewind(){
        rewindCommad.execute();
    }

    public void stop(){
        stopCommad.execute();
    }
}
