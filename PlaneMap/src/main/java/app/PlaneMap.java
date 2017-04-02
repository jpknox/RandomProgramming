package app;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by jpknox on 20/03/17.
 */

@SpringBootApplication
public class PlaneMap {
    private static Log logger = LogFactory.getLog(PlaneMap.class);



    public static void main(String[] args) throws Exception {
        SpringApplication.run(PlaneMap.class, args);
    }
}
