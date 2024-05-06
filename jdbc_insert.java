package New_javaJDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/employee","root","root");
	
			//prepared st -> SQL
			PreparedStatement psmt =con.prepareStatement("Insert into employtee value(?,?,?)");
	// insert -> table name Values - ask Form user ?
		
		// scanner - buffer reader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
//inser multiple recods 
			while(true) {
				System.out.println("Enter emp id:");
			int eno = Integer.parseInt((br.readLine()));//String
			System.out.println("Enter emp name");
			String ename = br.readLine();
			System.out.println("Enter emp sal:");
			int esal = Integer.parseInt(br.readLine());
			//psmt
			psmt.setInt( 1, eno);
			psmt.setString(2, ename);
			psmt.setInt(3, esal);
			int count = psmt.executeUpdate();
			if (count >0) {
			System.out.println(count+"Record inserted");
			}
			else {
				System.out.println("No recode inserted");
				
			}
			//New
			System.out.println("Do you want to sert mmore records");
			String ch = br.readLine();
			if(ch.equalsIgnoreCase("no"))
				break;
			}

			
}

catch(Exception e) {
	System.out.println(e);
	
}

}
}