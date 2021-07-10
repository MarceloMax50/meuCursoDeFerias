package api.cursoDeFerias.api;

import api.cursoDeFerias.model.Person;
import api.cursoDeFerias.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
