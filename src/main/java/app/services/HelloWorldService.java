package app.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jpknox on 20/03/17.
 */

@Component
public class HelloWorldService {

    @Value("${name:World}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }

}
