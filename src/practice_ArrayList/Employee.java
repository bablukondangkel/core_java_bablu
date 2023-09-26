package practice_ArrayList;

public class Employee {
	private int id;
	private String name;
	private double grossSalary;
	private double netSalary;
	private String gender;
	private int   age;

	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary=grossSalary;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary=netSalary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
	public String getgender() {
		return gender;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public Employee() {
		
	}
	
}	