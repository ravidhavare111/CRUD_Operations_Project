package EmployeePackage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		System.out.println("Employee Management System");
		System.out.println("  PRESS THE KEY BELLOW");
		System.out.println("1 - Insert new Employee Data");
		System.out.println("2 - Update Employee Name");
		System.out.println("3 - View All Employees Data");
		System.out.println("4 - Delete Employee Data");
		System.out.println();
		
		
		int choice = sc.nextInt();
		
		if(choice<1 || choice>4) {
			System.out.println("You enter wrong key");
			break;
		}
		
		
		switch(choice) {
		case 1 :	System.out.println("Please enter bellow details");
					System.out.println("ID, Name, Email, Salary");
					int id = sc.nextInt();
					sc.nextLine();
					String name = sc.nextLine();
					String email = sc.nextLine();
					int salary = sc.nextInt();
					EmployeePOJO emp = new EmployeePOJO(id, name, email, salary);
					EmployeeDAO.CreateEmployee(emp);
					break;				
			
		case 2 :	System.out.println("Please enter Employee's Correct name & ID");
					name = sc.nextLine();
					sc.nextLine();
					id = sc.nextInt();
					EmployeeDAO.UpdateEmployee(id,name);
					System.out.println();
					break;
					
		
			
		case 3 :	System.out.println("Current Employee's Data");
					ArrayList<EmployeePOJO> List = EmployeeDAO.allEmployee();
					for(EmployeePOJO object : List) {
						System.out.print(object.getID()+" ");
						System.out.print(object.getName()+" ");
						System.out.print(object.getEmail()+" ");
						System.out.print(object.getSalary()+" ");
						System.out.println();
					}
					System.out.println();
					break;
		
			
		case 4 :	System.out.println("Enter Employee ID to delete data");
					id = sc.nextInt();
					EmployeeDAO.deleteData(id);
					System.out.println();
					break;				
		}
		

		}
		sc.close();
		System.out.println("Program Ends");
		
	}
}
