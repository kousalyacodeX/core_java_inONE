package new_javaAdvance;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Map<String,Integer>studentScores = new HashMap<>();
	
				 // add key a values pairs
	
		 studentScores.put("Student1",92);
		 studentScores.put("Student2",97);
		 studentScores.put("Student3",90);
		 studentScores.put("Student3",80);
		 //for loop
		 System.out.println("Student Scores :");
		 for (Map.Entry<String,Integer> entry : studentScores.entrySet()) {
				 System.out.println(entry.getKey()+":"+entry.getValue());
	}
		 //random oder
		 //particular elements
		 System.out.println();
		 //check if some key exists or not
		 if(studentScores.containsKey("Student4")) {
			 System.out.println("Students4 :"+studentScores.get("Student4"));
		 }
		 else {
			 
			 System.out.println("Students4 not found.");
		 }
		 //remove
		 studentScores.remove("Student1");
		 System.out.println();
		 for (Map.Entry<String,Integer> entry : studentScores.entrySet()) {
			 System.out.println(entry.getKey()+":"+entry.getValue());
}
		 }
	}

