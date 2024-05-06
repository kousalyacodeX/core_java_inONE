package new_javaAdvance;
import java.util.Map;
import java.util.HashMap;
public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Map<String,Integer> studentScores = new HashMap<>();
			
		 // add key a values pairs

 studentScores.put("Student1",92);
 studentScores.put("Student2",97);
 studentScores.put("Student3",90);
 studentScores.put("Student3",80);
 //for loop
 System.out.println("Student Scores :");
 for (Map.Entry<String,Integer> entry : studentScores.entrySet()) {
		 System.out.println(entry.getKey()+":"+entry.getValue());
}}

}
