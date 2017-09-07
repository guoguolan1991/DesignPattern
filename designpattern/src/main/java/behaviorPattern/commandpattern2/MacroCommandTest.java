package behaviorPattern.commandpattern2;

/**
 * Created by Miller on 2017/9/7 0007.
 * 宏命令测试
 */
public class MacroCommandTest {
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

        MacroCommand macroCommand = new MacroAudioCommand();

        macroCommand.add(playCommand);
        macroCommand.add(rewindCommand);
        macroCommand.add(stopCommand);
        macroCommand.execute();
    }
}
