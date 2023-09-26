package practice_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeMain {

	private static Employee emp;
	private static char[] sum1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberofemployee = 2;
		ArrayList<Employee> empList = new ArrayList<>();
		for (int i = 1; i <= numberofemployee; i++) {
			System.out.println("Enter id of employee" + i);
			int id = sc.nextInt();
			System.out.println("Enter name of employee" + i);
			String name = sc.next();
			System.out.println("Enter grossSalary of employee" + i);
			double grossSalary = sc.nextDouble();
			System.out.println("Enter netSalary of employee" + i);
			double netSalary = sc.nextDouble();
			System.out.println("Enter gender of employee" + i);
			String gender = sc.next();
			System.out.println("Enter age of employee" + i);
			int age = sc.nextInt();
			Employee a = new Employee();
			a.setId(id);
			a.setName(name);
			a.setGrossSalary(grossSalary);
			a.setNetSalary(netSalary);
			a.setgender(gender);
			a.setage(age);
			empList.add(a);
		}
		int i = 1;
		double sum1 = 0;
		double sum2 = 0;
		for (Employee emp : empList) {
			sum1 = sum1 + emp.getGrossSalary();
			sum2 = sum2 + emp.getNetSalary();
		}
		double avgGross = sum1 / empList.size();
		double avgNet = sum2 / empList.size();
		System.out.println("Average of GrossSalary:"+avgGross);
		System.out.println("Average of NetSalary:"+avgNet);

		
		
		double sum3 = 0;
		double sum4 = 0;
		for (Employee emp : empList) {
			if (emp.getgender().equalsIgnoreCase("female")) {
				sum3 = sum3 + emp.getGrossSalary();
				sum4 = sum4 + emp.getNetSalary();

			}
		}
		System.out.println("Total GrossSalary:" + sum3);
		System.out.println("Total NetSalary:"+ sum4);
		
		double deduction;
		double grossSalary=0;
		double netSalary=0;
		int age=0;
		for (Employee emp : empList) {
			if (emp.getgender().equalsIgnoreCase("male")) {
				grossSalary=grossSalary+emp.getGrossSalary();
				netSalary=netSalary+emp.getNetSalary();
			}
		}
			deduction=grossSalary-netSalary;
		System.out.println("Total Deduction of Male employee:"+deduction);
		
		
			
			for(Employee emp : empList) {
				if (emp.getgender().equalsIgnoreCase("female") && emp.getage()>2000) {
					System.out.println("Female age is 20000:"+emp.getage());
					
		}
			
		}
			System.out.println("Male whose salary is greter than 25000");
			for(Employee emp: empList) {
				if(emp.getNetSalary()>25000) {
				}
			}
	}
			
}
