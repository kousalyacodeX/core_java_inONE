package new_javaAdvance;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{

			int age = 18;
			// validate age
			validateAge(age);
			System.out.println("Age is valid. You can access the website");
			}
			catch(AgeTooYoungException e){
			System.out.println("Exception Caught"+e.getMessage());
			}
			}
			// Function

				// Function
				public static void validateAge(int age)throws AgeTooYoungException{
				// age<=17 -> throw
				if (age <= 15){
				throw new AgeTooYoungException("Age is too lessa. must be greater than 18 to access the website.");

				



	}
				}
}
