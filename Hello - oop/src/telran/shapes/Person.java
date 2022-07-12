package telran.shapes;

public class Person {
	private final long  id = 123456;
	private final int birthYear = 1975;
	private String email;
	


	public Person(long id, int birthYear, String email) {
		setEmail(email);
		
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public String getEmail() {
		return email;
	}
}
