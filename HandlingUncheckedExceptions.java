package new_javaAdvance;

public class HandlingUncheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Handling Unchecked Exceptions
                 // run time exception
		        try {
		        	// An array of integers
		            int[] numbers = {10, 20, 30}; 
		         // Initializing denominator to 0
		            int denominator = 0; 
		         // Trying to divide by 0 (which will throw an ArithmeticException)
		            int result = numbers[2] / denominator; 
		         // This line won't execute if an exception occurs
		            System.out.println("Result is :" + result); 
		         // Catch block for handling ArithmeticException
		        } catch (ArithmeticException e) { 
		            System.out.println("ArithmeticException caught :" + e.getMessage());
		        } finally { // Finally block always executes, whether an exception occurred or not
		            System.out.println("Finally block executed");
		        } 
	}
}
