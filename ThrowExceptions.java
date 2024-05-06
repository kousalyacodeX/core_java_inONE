package new_javaAdvance;

public class ThrowExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//age as input -> invalid age, invalid input.
		//throw
		try{
		int age = 5;
		validateAge(age);
		System.out.println("Age is valid");
		
	}
		catch(IllegalArgumentException e) {
		System.out.println("IllegalargumentException caught : "+e.getMessage());

		}
	}
		//Function -> validateAge age
	
		public static void validateAge(int age){
		if (age < 0){
		//throw -> custom
			
		throw new IllegalArgumentException ("Age cannot be negative");

		}
		//rest code
	}
}
