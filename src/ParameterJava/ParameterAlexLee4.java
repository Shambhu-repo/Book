package ParameterJava;

public class ParameterAlexLee4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(2,4)); // here we put argumetn what we want .
	int result1 = add(3,6); // We can print out multiple print .
	int result2 = add(10,20);
	int result3=add(12,3);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	 
	// Second method multiply invoking
	System.out.println(multiply(3,7));
	
	result1=multiply(9,0);
	result2=multiply(6,3);
	System.out.println(result1);
	System.out.println(result2);
	}
	
	public static int add(int x , int y) { // parameter
		return x+y;
		
	}
	public static int multiply(int x, int y) {
		return x*y;
	}

}
