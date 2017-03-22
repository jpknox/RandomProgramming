package app.services.planelist;

import app.services.LoggerService;
import app.services.planelist.pojo.AircraftListPojo;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by jpknox on 22/03/17.
 */
@Component
public class PlaneListLoggerService extends LoggerService {

	public void consoleAircraftList(AircraftListPojo aircraftListPojo) {
		//Count each model of aircraft
		Map<String, Long> aircraftByType =
				aircraftListPojo.getAircraftPojo().stream()
						.filter(p -> p.getMdl() != null)
						.collect(Collectors.groupingBy(a -> a.getMdl(), Collectors.counting()));

		this.println("AircraftPojo grouped by type:");
		for (Map.Entry<String, Long> entry : aircraftByType.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		this.println("List end.");
	}



}
