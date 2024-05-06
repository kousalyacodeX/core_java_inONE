package new_javaAdvance;
import java.util.ArrayList;

public class GadgetArrayList {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<gadget> gadgetList = new ArrayList<>();
			//adding objects

			gadgetList.add(new gadget("Smarphone", 25000.00));
			gadgetList.add(new gadget("Laptop", 55000.00));
			gadgetList.add(new gadget("Headphones", 25000.00));
			
			//display 
			
			System.out.println("List of Gadgets");
			
			for(gadget gadget : gadgetList){
				//enhanced for loop
		
				System.out.println(gadget);
					
			}
			// access element by index 
			// Get 
			gadget laptop = gadgetList.get(1);
			System.out.println("Laptop Details :"+laptop);
        // remove
			gadgetList.remove(0);
			System.out.println("After removing :");
			for(gadget gadget : gadgetList){
				//enhanced for loop
		
				System.out.println(gadget);
				
			}
	}}
