package ParameterJava;

public class ParameterInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;
		String name = "shambhu";
		int street = 10;
		
		System.out.println("before mehtod :");
		System.out.println(age +", "+name+", "+street);
		
		
		//invoke method
		method(100 , "sita" , 12); // puting the value according to loacal variable in method
		                             // declaration .
		method(200,"Sushila",13);

	}
	
	public static void method(int a , String s , int st) {
		
		System.out.println("Afeter method calling");
		System.out.println(a+", " + s + "," + st );
		
	}
	
	

}

