package new_javaAdvance;

public class HandlingCheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // How can I handle checked exceptions using this method?
		//compile time exception  - complier taker care
		
		try{
			Class temp = Class.forName("Class2");

			}
			catch (ClassNotFoundException e){
			System.out.println("Classe does not exist. Check the name of the class");
			}
			}
	}

	