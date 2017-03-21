package app.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import app.services.HelloWorldService;
import org.springframework.web.client.AsyncRestOperations;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

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
		System.out.println("\n\n HelloWorld \n\n");
		return this.helloWorldService.getHelloMessage();
	}

	@GetMapping("/")
	@ResponseBody
	public String planeData() {
		String url = "http://public-api.adsbexchange.com/VirtualRadar/AircraftList.json?fRegS=G-";
//		String url = "http://public-api.adsbexchange.com/VirtualRadar/AircraftList.json";

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("User-Agent", "Mozilla/5.0 (X11; Fedora; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		} catch (HttpClientErrorException e) {
			System.out.println("\n\n" + e.getMessage() + "\n" + e.getResponseBodyAsString() + "\n\n");
			return "Nothing.";
		}

		// Redirect
		if (response.getStatusCode().toString().equals("301")) {
			url = response.getHeaders().toSingleValueMap().get("Location");
			try {
				response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
			} catch (HttpClientErrorException e) {
				System.out.println("\n\n" + e.getMessage() + "\n" + e.getResponseBodyAsString() + "\n\n");
			}
		}

		ObjectMapper mapper = new ObjectMapper();

		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		Object json = null;
		String indented = "No JSON to parse.";
		try {
			json = mapper.readValue(response.getBody(), Object.class);
			indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
		} catch (IOException e) {
			e.printStackTrace();
		}


		return indented;
	}

}
