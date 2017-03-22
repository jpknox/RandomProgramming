package app.services.planelist;

import app.services.LoggerService;
import app.services.planelist.pojo.AircraftList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by jpknox on 22/03/17.
 */
@Component
public class PlaneListService {

	@Autowired
	private LoggerService loggerService;

	public void getPlaneData(String filter, Model model) {
		String url = null;
		if (!filter.equals("all")) {
			System.out.println("\n\n Filter detected. \n\n");
			url = "http://public-api.adsbexchange.com/VirtualRadar/AircraftList.json?" + filter;
		} else {
			System.out.println("\n\n No filter. \n\n");
			url = "http://public-api.adsbexchange.com/VirtualRadar/AircraftList.json";
		}

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("User-Agent", "Mozilla/5.0 (X11; Fedora; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		} catch (HttpClientErrorException e) {
			loggerService.println("\n\n" + e.getMessage() + "\n" + e.getResponseBodyAsString() + "\n\n");
		}

		// Redirect
		if (response.getStatusCode().toString().equals("301")) {
			url = response.getHeaders().toSingleValueMap().get("Location");
			try {
				response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
			} catch (HttpClientErrorException e) {
				loggerService.println("\n\n" + e.getMessage() + "\n" + e.getResponseBodyAsString() + "\n\n");
			}
		}

		// Format JSON to PrettyPrint
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		Object json = null;
		String indented = "No JSON to parse.";
		try {
			json = mapper.readValue(response.getBody(), Object.class);
			indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
		} catch (IOException e) {
			loggerService.println("Error when formatting JSON for display purposes.");
			e.printStackTrace();
		}

		//Map JSON to Pojo's
		mapper.disable(SerializationFeature.INDENT_OUTPUT); //TODO: Maybe remove
		try {
			AircraftList aircraftList = mapper.readValue(response.getBody(), AircraftList.class);

			if (!(aircraftList.getAircraft() == null)) {
				loggerService.println("Number of aircraft retrieved is: " + aircraftList.getAircraft().size());
			} else {
				loggerService.println("Aircraft list is null.");
			}

			//Count each model of aircraft
			Map<String, Long> aircraftByType =
					aircraftList.getAircraft().stream()
							.collect(Collectors.groupingBy(a -> a.getMdl(), Collectors.counting()));

			loggerService.println("Aircraft grouped by type:");
			for (Map.Entry<String, Long> entry : aircraftByType.entrySet()) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
			loggerService.println("List end.");

			


		} catch (IOException e) {
			loggerService.println("Error when mapping Aircraft JSON to Pojo.");
			e.printStackTrace();
		}
//		loggerService.println(indented);

		//Format as HTML
		model.addAttribute("JSONPlaneData", indented);
	}


}
