package new_javaAdvance;

public class LambdaFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a,b) -> a+b; // "Lambda Expression"
		int result = add.operate(5,8);
		System.out.println("result is :"+ result);
	}

}
