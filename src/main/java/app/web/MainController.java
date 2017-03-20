package app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import app.services.HelloWorldService;

/**
 * Created by jpknox on 20/03/17.
 */
@Controller
public class MainController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/greeting")
    @ResponseBody
    public String helloWorld() {
        return this.helloWorldService.getHelloMessage();
    }

}
