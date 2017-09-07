package behaviorPattern.commandpattern2;

/**
 * Created by Miller on 2017/9/7 0007.
 */
public class ClientTest {
    public static void main(String[] args) {
        /**
         * 创建接受者对象
         */
        AudioPlayer audioPlayer = new AudioPlayer();

        /**
         * 创建命令对象
         */
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        /**
         * 创建请求者对象
         */
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommad(rewindCommand);
        keypad.setStopCommad(stopCommand);

        keypad.play();
        keypad.rewind();
        keypad.stop();
    }
}
