package telran.b7a.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.b7a.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
