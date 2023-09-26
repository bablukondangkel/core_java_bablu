package arraylist_practice;

public class Employee {
	
	private int empId;
	
	private String empName;
	
	private int age;
	
	private String employmentType;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getEmploymentType() {
		return employmentType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int empId, String empName, int age, String employmentType) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.employmentType = employmentType;
	}
	
public Employee() {
		
	}

	public String toString() {
		return "[empId is: "+empId +" EmpName is: " + empName + " Age is: "+age+ " Employment Type is: "+employmentType+"]";
	}
	
	
	

}
