package api.cursoDeFerias.api;

import api.cursoDeFerias.model.Person;
import api.cursoDeFerias.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> listPeople() {
        return personService.listPeople();
    }

    @GetMapping(path = "{id}")
    public Person retrievePeopleById(@PathVariable("id") UUID id) {
        return personService.retrievePersonById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePerson(@PathVariable("id") UUID id) {
        personService.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id, @RequestBody Person person) {
        personService.updatePerson(id, person);
    }
}
