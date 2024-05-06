package new_javaAdvance;

public class multipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Handling Exceptions with Multiple Catch blocks.
		
		try{
			int []numbers ={ 10, 20, 30};
		//0,1,2 // An array of integers
		// Initializing denominator to 0
			int denominator = 5;
			int result = numbers[4]/denominator;// Trying to divide by 0 (which will throw an ArithmeticException)
			System.out.println("Result is :"+ result);
			}
		// Catch block for handling ArrayIndexOutOfBoundsException
			catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException caught:"+e.getMessage());
			
			}
		// Catch block for handling any other type of Exception
			catch(ArithmeticException e) {
			System.out.println("ArithmeticExeption caught :"+e.getMessage());//e.getMessage()e.getMessage()" is a predefined method in Java, which is used to retrieve the error message that caused the exception.

			}
		    catch(Exception e){
			System.out.println("Exception Caugth:"+e.getMessage());

		    }
		 // Finally block always executes, whether an exception occurred or not
		   finally{
			System.out.println("Finally block executed");
	}
	}
}
