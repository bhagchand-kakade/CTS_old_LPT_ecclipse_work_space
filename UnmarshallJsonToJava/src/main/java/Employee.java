
public class Employee {

	private int id;
	private String Name;
	private int yearOfexperience;
	private String SME;

	
	public Employee() {
		
	}
	public Employee(int id, String name, int yearOfexperience, String sME) {
		super();
		this.id = id;
		Name = name;
		this.yearOfexperience = yearOfexperience;
		SME = sME;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYearOfexperience() {
		return yearOfexperience;
	}
	public void setYearOfexperience(int yearOfexperience) {
		this.yearOfexperience = yearOfexperience;
	}
	public String getSME() {
		return SME;
	}
	public void setSME(String sME) {
		SME = sME;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", yearOfexperience=" + yearOfexperience + ", SME=" + SME
				+ "]";
	}
	
	
}
