package EmployeePackage;

public class EmployeePOJO {
	private int ID;
	private String name;
	private String email;
	private int salary;
	
	public EmployeePOJO() {
		
	}
	
	public EmployeePOJO(int ID, String name, String email, int salary) {
		super();
		this.ID = ID;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "EmployeePOJO [ID=" + ID + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	
	


}
