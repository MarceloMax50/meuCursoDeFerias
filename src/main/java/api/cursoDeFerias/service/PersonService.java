package api.cursoDeFerias.service;

import api.cursoDeFerias.dao.PersonDao;
import api.cursoDeFerias.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

    public List<Person> listPeople() {
        return personDao.getAllPeople();
    }

    public Optional<Person> retrievePersonById(UUID id) {
        return personDao.getPersonById(id);
    }

    public int deletePerson(UUID id){
        return personDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person person){
        return personDao.updatePersonById(id, person);
    }
}
