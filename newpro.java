package New_javaJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class newpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        // JDBC URL, username, and password of the database
		        String url = "jdbc:mysql://localhost:3306/mydatabase";
		        String username = "username";
		        String password = "password";

		        // Establishing a connection
		        try (Connection connection = DriverManager.getConnection(url, username, password)) {
		            System.out.println("Connected to the database!");

		            // Now you can execute SQL queries, perform database operations, etc.
		            // For example:
		            // Statement statement = connection.createStatement();
		            // ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

		        } catch (SQLException e) {
		            System.out.println("Connection failed!");
		            e.printStackTrace();

	}

}}
