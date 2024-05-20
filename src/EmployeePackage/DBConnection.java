package EmployeePackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection conn;

	public static Connection connect() {
		// TODO Auto-generated method stub
		
		try {
			String url = "jdbc:mysql://localhost:3306/EmployeeDataBase";
			String userName = "root";
			String password = "Admin@123";
			conn = DriverManager.getConnection(url, userName, password);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
}
