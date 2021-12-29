package telran.b7a.person.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto extends PersonDto {
	String company;
	Integer salary;

	public EmployeeDto(Integer id, String name, LocalDate birthDate, AddressDto address, String company,
			Integer salary) {
		super(id, name, birthDate, address);
		this.company = company;
		this.salary = salary;
	}
}
