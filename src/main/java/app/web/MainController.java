package app.web;

import app.services.HelloWorldService;
import app.services.planelist.PlaneListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jpknox on 20/03/17.
 */
@Controller
public class MainController {

	@Autowired
	private HelloWorldService helloWorldService;

	@Autowired
	private PlaneListService planeListService;

	@GetMapping("/greeting")
	@ResponseBody
	public String helloWorld() {
		System.out.println("\n\n HelloWorld \n\n");
		return this.helloWorldService.getHelloMessage();
	}

	@RequestMapping(value = "/{filter}", method=RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public String getPlaneData(@PathVariable String filter, Model model) {
		planeListService.getPlaneData(filter, model);
		return "PlaneData";
	}

	@RequestMapping(value = "/html/{name}", method=RequestMethod.GET)
	public String getBasepage(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}

}
