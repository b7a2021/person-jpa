package telran.b7a.person.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import telran.b7a.person.dao.PersonRepository;
import telran.b7a.person.dto.AddressDto;
import telran.b7a.person.dto.PersonDto;
import telran.b7a.person.dto.exceptions.PersonNotFoundException;
import telran.b7a.person.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	PersonRepository personRepository;
	ModelMapper modelMapper;

	@Autowired
	public PersonServiceImpl(PersonRepository personRepository, ModelMapper modelMapper) {
		this.personRepository = personRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	@Transactional
	public boolean addPerson(PersonDto personDto) {
		if(personRepository.existsById(personDto.getId())) {
			return false;
		}
		personRepository.save(modelMapper.map(personDto, Person.class));
		return true;
	}

	@Override
	public PersonDto findPersonById(Integer id) {
		Person person = personRepository.findById(id)
				.orElseThrow(() -> new PersonNotFoundException());
		return modelMapper.map(person, PersonDto.class);
	}

	@Override
	public PersonDto removePerson(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonDto updatePersonName(Integer id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonDto updatePersonAddress(Integer id, AddressDto addressDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<PersonDto> findPersonsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<PersonDto> findPersonsBetweenAges(Integer minAge, Integer maxAge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<PersonDto> findPersonsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
