import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JoaoK on 16/07/2017.
 */
public class AppCache {

    public static final File cacheFile = new File(getAppDirectory(), "cache.ser");
    static Map pathToHashMap;

    public void loadCache() {
//        if (cacheFile.exists() || cacheFile.canRead()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(cacheFile))) {
                pathToHashMap = (Map) objectInputStream.readObject();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
//        }

        if (pathToHashMap == null) {
            pathToHashMap = new HashMap();
        }

    }

    public void saveCache() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(cacheFile))) {
            objectOutputStream.writeObject(pathToHashMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map getCache() {
        return pathToHashMap;
    }

    public static File getAppDirectory() {
        return new File(System.getProperty("user.dir"));
    }

}
