package new_javaAdvance;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		TreeSet<String>cars = new TreeSet<String>();
			
			
			//Add
			cars.add("Honda city");
			cars.add("BMW");
			cars.add("Marcedes");
			cars.add("Ford");
			
			//Display
			for(String Car : cars) {
				System.out.println(Car);
			}
			
			// remove
			cars.remove("Marcedes");
			System.out.println("after removing");
			for(String car : cars) {
				System.out.println(car);
				
		//Sorted oders dictionary, phone numbers
			}
	}

}
