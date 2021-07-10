package api.cursoDeFerias.service;

import api.cursoDeFerias.dao.PersonDao;
import api.cursoDeFerias.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
