package behaviorPattern.commandpattern2;

/**
 * Created by Miller on 2017/9/7 0007.
 */
public class StopCommand implements Command{
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void execute() {
        audioPlayer.play();
    }
}
