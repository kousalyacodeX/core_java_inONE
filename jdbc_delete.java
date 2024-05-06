package New_javaJDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/employee","root","root");
			
			//
		
			Statement smt = con.createStatement();
			
			// Eno ->
			
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Enter deleting Emp id:");
				int eno = Integer.parseInt(br.readLine());
			    int count = smt.executeUpdate("delete from employee where eno="+eno);
			    if(count == 1) {
			    	System.out.println(count +"record deleted");
			    }
				
			    else {
			    	System.out.println("No record deleted");
			    	
			    }
			    // multiple 
			    
		    	System.out.println(count +"record deleted");
String ch = br.readLine();
if(ch.equalsIgnoreCase("no"));
break;
			}}
		
catch(Exception e) {
	System.out.println(e);
	
				
			}
			
		}
		
	}
		
		
	


