package new_javaAdvance;

import java.util.LinkedList;

public class GadgetLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				LinkedList<gadget> GadgetList = new LinkedList<>();
				//adding objects

				GadgetList.add(new gadget("Smarphone", 25000.00));
				GadgetList.add(new gadget("Laptop", 55000.00));
				GadgetList.add(new gadget("Headphones", 25000.00));
				
			
				//display 				
				for(gadget gadget :GadgetList){
					System.out.println(gadget);
						
				}
				// access element by index 
				// Get 
				gadget Headphones = GadgetList.get(2);
				System.out.println("Headphones Details :"+Headphones);
	        // remove
				GadgetList.removeFirst();
				System.out.println("After removing :");
				for(gadget gadget : GadgetList){
					//enhanced for loop
			
					System.out.println(gadget);
					
				}
				
				// (head) Smartphone -> Laptop -> headphones
				//(head Laptop Headphones)
		}
	
	
}
