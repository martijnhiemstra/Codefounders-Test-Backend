package nl.codefounders.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PersonController {

	@GetMapping("api/person/all")
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Martijn", "Hiemstra"));
		persons.add(new Person("Henk", "Jansen"));		
		persons.add(new Person("Magreet", "Pieters"));		
		
		return persons;
	}
	
}
