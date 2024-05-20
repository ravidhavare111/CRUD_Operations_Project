package EmployeePackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO {

	public static void CreateEmployee(EmployeePOJO emp) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = DBConnection.connect();
		String query = Query.createData;
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setInt(1, emp.getID());
		pstmt.setString(2, emp.getName());
		pstmt.setString(3, emp.getEmail());
		pstmt.setInt(4, emp.getSalary());
		
		pstmt.execute();
		
		System.out.println("New Employee Data add succesfully");
		System.out.println();
	}

	public static void UpdateEmployee(int id, String name) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = DBConnection.connect();
		String query = Query.UpdateData;
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setString(1, name);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		
		System.out.println("Employee data Updated Succesfully");
		pstmt.close();	
	}

	public static ArrayList<EmployeePOJO> allEmployee() throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<EmployeePOJO> newList = new ArrayList<>();
		
		Connection conn = DBConnection.connect();
		String query = Query.allData;
		
		Statement stmt = conn.createStatement();
		
		ResultSet table = stmt.executeQuery(query);
		
		while(table.next()) {
			EmployeePOJO newObj = new EmployeePOJO(table.getInt(1), table.getString(2), table.getString(3), table.getInt(4));
			newList.add(newObj);
		}
	
		return newList;
	}

	public static void deleteData(int id) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = DBConnection.connect();
		String query = Query.deleteData;
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, id);
		
		pstmt.executeUpdate();
		System.out.println("Data deleted succesfully");
		
		conn.close();
		
	}

}
