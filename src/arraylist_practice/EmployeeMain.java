package arraylist_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfEmployees = 2;
		ArrayList<Employee> empList = new ArrayList<>();
		System.out.println("Enter Employee Details");
		for(int i = 1; i<=numberOfEmployees; i++) {
			System.out.println("Enter name of employee "+i);
			String name  = sc.next();
			System.out.println("Enter employee id of employee "+i);
			int id = sc.nextInt();
			System.out.println("Enter employee type of employee "+i);
			String type  = sc.next();
			Employee e = new Employee();
			e.setEmpId(id);
			e.setEmpName(name);
			e.setEmploymentType(type);
			empList.add(e);
		}
		int i = 1;
		for(Employee emp: empList) {
			System.out.println("Name of Employee "+i +" is :"+emp.getEmpName());
			System.out.println("Id of Employee "+i +" is :"+emp.getEmpId());
			System.out.println("Employment Type of Employee "+i +" is :"+emp.getEmploymentType());
			i++;
		}
	}

}
