package EmployeePackage;

public class Query {

	public static String createData = "insert into EmployeeTable values (?,?,?,?)";
	public static String UpdateData = "update EmployeeTable set eName = ?  where eID = ?";
	public static String allData = "select * from EmployeeTable";
	public static String deleteData = "delete from EmployeeTable where eID = ?";
	

}
