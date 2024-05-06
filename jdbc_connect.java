package New_javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//driver
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection string -> MySQL
			//database URL - uniform resource locator, DB name, Location
		
			Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/employee","root","root");
	// tables -> Employee info
			// Statemnet
		Statement smt = con.createStatement();
	// Querry -> comn with db
		//employee -> eno, ename esal
		smt.executeUpdate("create table employee(eno int, ename varchar(30), esal int)");
		System.out.println("Table created succesfully");
con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		
		}
	
	}
}
