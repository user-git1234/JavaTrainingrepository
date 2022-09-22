package day4;

public class Candidate {
	private String name;
	private String gender;
	private int expsalary;
	
	public Candidate(String name, String gender, int expsalary) {
		super();
		this.name = name;
		this.gender = gender;
		this.expsalary = expsalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getEx_salary() {
		return expsalary;
	}
	public void setEx_salary(int ex_salary) {
		this.expsalary = ex_salary;
	}
	@Override
	public String toString() {
		return " Details: Name=" + name + "Gender=" + gender + "Expected_salary=" + expsalary;
	}
	
}