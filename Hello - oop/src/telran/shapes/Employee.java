package telran.shapes;

public class Employee extends Person {

	private int basicSalary;

	public Employee(long id, int birthYear, String email, int basicSalary) {
		super(id, birthYear, email);
		setBasicSalary(basicSalary);
	}

//	@Override
//	public void setEmail(String email) {
//		super.setEmail(email);
//	}

	public int setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
		return basicSalary;
	}
public int getBasicSalary() {
	return basicSalary;
}
	public int computePay() {

		return basicSalary;
	}

}
