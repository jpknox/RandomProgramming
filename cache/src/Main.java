import java.util.Map;

/**
 * Created by JoaoK on 16/07/2017.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        AppCache appCache = new AppCache();
        appCache.loadCache();
        Map<String, String> cache = appCache.getCache();
//        cache.put("Fifth House", "13 North View");

        int i = 1;
        for(Map.Entry<String, String> entry: cache.entrySet()) {
            System.out.println(i + ": " + entry.getKey() + "/" + entry.getValue());
        }

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                appCache.saveCache();
            }
        });
    }
}
