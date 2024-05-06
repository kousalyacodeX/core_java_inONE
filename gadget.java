package new_javaAdvance;

public class gadget {

	private String name;
	private double price;
	public gadget(String name, double price){
	  this.name = name;
	  this.price = price;
	
	}
	public String getName(){
		return name;

	}
	public double getPrice(){
	return price;
	}
	//tostring() -> converts object to string, display the info in string Format
	 
	@Override
	public String toString(){
	return "gadget [name=" + name +", price="+price+"]";

	}

	}


