package new_javaAdvance;
import java.util.Scanner;

public class HandlingExceptions {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		// division by zero
		// scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int  numerator = scanner.nextInt();

		System.out.println("Enter the Denominator");
		int denominator = scanner.nextInt();

		// try block
		
		try{
			
			int result = numerator / denominator;
			System.out.println("Result is :"+result);

			}
		//catch block
			catch(ArithmeticException e)
		{
			System.out.println("Error ; Division by zero is not posssible");
			
			}
		//finally
		finally {
		//clean up code
		scanner.close();
		System.out.println("Finally block executed");

			}
}}
