package New_javaJDBC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class jdbc_update {
public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/employee","root","root");
			
			//
		
			Statement smt = con.createStatement();
			
			// E-no ->
			
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			
			// update -> E-sal, E-no
			
			System.out.println("Enter emp id whose data has to be update:");
			int eid = Integer.parseInt(br.readLine());
			System.out.println("Enter new salary: ");
			int value = Integer.parseInt(br.readLine());
			int count = smt.executeUpdate("update employee set esal ="+value+"where eno="+eid);
			if(count >0) {
				System.out.println(count + "record updated");
			}
			else {
				
				System.out.println(" no record updated");
			}
}
catch (Exception e){
	System.out.println(e);

	
}
			
	}
}
