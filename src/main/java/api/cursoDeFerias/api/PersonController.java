package api.cursoDeFerias.api;

import api.cursoDeFerias.model.Person;
import api.cursoDeFerias.service.PersonService;
import org.springframework.stereotype.Repository;

@Repository
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
