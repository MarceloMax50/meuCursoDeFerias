package api.cursoDeFerias.dao;

import api.cursoDeFerias.model.Person;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, String name);

    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person.getName());
    }
}
