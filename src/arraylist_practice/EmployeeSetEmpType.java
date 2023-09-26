package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeSetEmpType {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
				new Employee(101, "Rakesh", 31, "Full Time"),
				new Employee(102, "Sita", 45, "Full Time"),
				new Employee(103, "Ravi", 41, "Part Time"),
				new Employee(104, "Linta", 37, "Full Time"),
				new Employee(105, "Sanjay", 32, "Part Time")
				)); 
		
		for(Employee emp: empList) {
			if(emp.getAge()>40 && !emp.getEmploymentType().equalsIgnoreCase("Full Time")) {
				emp.setEmploymentType("Full Time");
			}
		}
		
		System.out.println(empList);
		
	}

}
