package behaviorPattern.observerpattern2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miller on 2017/8/15 0015.
 */
public class WriterManager {
    private Map<String, Writer> writerMap = new HashMap<String, Writer>();

    public void addWriter(Writer writer){
        writerMap.put(writer.getName(), writer);
    }

    public Writer getWriter(String name){
        return writerMap.get(name);
    }

    private WriterManager(){}

    public static WriterManager getInstance(){
        return WriterManagerInstance.instance;
    }

    private static class WriterManagerInstance{
        private static WriterManager instance = new WriterManager();
    }
}
