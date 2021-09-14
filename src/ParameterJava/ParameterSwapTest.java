package ParameterJava;

public class ParameterSwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =100;
		int b= 90;
		System.out.println("before swap :" + a  + " , b value : " + b);
		
		
		//invoke method
		method(a,b);
		

	}
	public static void method(int h ,int n) {
		//Swap a with b
		int c = h; // value of a shifted to c . a became empty .
		h = n; //  value of b shifted to a . b became empty .
		n=c;     // value of a from c , shihfted to b . Swaping concept done . 
		System.out.println("afters swap (inside), a = " + h  + " , b = " + n);
	}

	}

