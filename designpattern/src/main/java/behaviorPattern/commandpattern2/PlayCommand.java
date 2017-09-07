package behaviorPattern.commandpattern2;

/**
 * Created by Miller on 2017/9/7 0007.
 */
public class PlayCommand implements Command{
    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void execute() {
        audioPlayer.play();
    }
}
