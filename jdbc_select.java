package New_javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/employee","root","root");
		//
		Statement smt = con.createStatement();
		
	// fetching Data -> 2 rows
		ResultSet rs = smt.executeQuery("select * from employee");//select
		while(rs.next()) {
			int eid = rs.getInt(1);
			String ename = rs.getNString(2);
			int esal = rs.getInt(3);
			System.out.println("EmpId:"+eid);
			System.out.println("Emm Name:"+ename);
			System.out.println("Emp salary:"+esal);
			System.out.println();
			
		   }
	}
	
		catch(Exception e){
			
			System.out.println(e);
}
}

