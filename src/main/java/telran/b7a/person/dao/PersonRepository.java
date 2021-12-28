package telran.b7a.person.dao;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.b7a.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	Stream<Person> findByName(String name);
	
	Stream<Person> findByBirthDateBetween(LocalDate from, LocalDate to);
	
	Stream<Person> findByAddressCity(String city);
}
