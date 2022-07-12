package telran.shapes.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import telran.shapes.Person;
import telran.shapes.Employee;
import telran.shapes.WageEmployee;
import telran.shapes.SalesPerson;

class PersonTest {
	
	@Test
	void PersonTests() {
		long id  = 123456;
		int birthYear = 1975;
		String email = "test@gmail.com";
		
		Person person = new Person(id, birthYear, email);
		assertEquals(id, person.getId());
		assertEquals(birthYear, person.getBirthYear());
		assertEquals(email, person.getEmail());
		email = "test2@gmail.com";
		person.setEmail(email);
		assertEquals(email, person.getEmail());
	}

	@Test
	void EmployeeTests() {
		long id  = 123456;
		int birthYear = 1975;
		String email = "test@gmail.com";
		int basicSalary = 5500;
		
		Employee employee = new Employee(id, birthYear, email, basicSalary);
		assertEquals(id, employee.getId());
		assertEquals(birthYear, employee.getBirthYear());
		assertEquals(email, employee.getEmail());
		
		email = "test2@gmail.com";
		employee.setEmail(email);
		assertEquals(email, employee.getEmail());
		
		basicSalary = 5700;
		employee.setBasicSalary(basicSalary);
		assertEquals(basicSalary, employee.computePay());
	}
	
	@Test
	void WageEmployeeTests() {
		long id  = 123456;
		int birthYear = 1975;
		String email = "test@gmail.com";
		int basicSalary = 5500;
		int wage = 35;
		int hours = 6;
		
		WageEmployee wageemployee = new WageEmployee(id, birthYear, email, basicSalary, wage, hours);
		assertEquals(basicSalary, wageemployee.getBasicSalary());
		assertEquals(wage*hours, wageemployee.computePay());
		
		wage = 37;
		hours = 8;
		wageemployee.setWage(wage);
		wageemployee.setHours(hours);
		assertEquals(wage*hours, wageemployee.computePay());

	}
	@Test
	void SalesPersonTests() {
		long id  = 123456;
		int birthYear = 1975;
		String email = "test@gmail.com";
		int basicSalary = 5500;
		int sales = 100000;
		int percentPay = 1;
		
		SalesPerson salesPerson = new SalesPerson(id, birthYear, email, basicSalary, sales, percentPay);
		assertEquals(basicSalary, salesPerson.getBasicSalary());
		assertEquals((sales*percentPay)/100, salesPerson.computePay());
		
		sales = 170000;
		percentPay = 2;
	salesPerson.setPercentPay(percentPay);
	salesPerson.setSales(sales);

	assertEquals((sales*percentPay)/100, salesPerson.computePay());

	}
	
}
