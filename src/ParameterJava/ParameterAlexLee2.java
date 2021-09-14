package ParameterJava;

public class ParameterAlexLee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// invoke saySomething (method)
		saySomething("Sumedhya"); // if we dont put here argument it thorows error saying "is not 
		                 //applicable for the argument() . so we have to pass the argument .
		                 // i have passed argument "Sumedhya" .
		                 // We can print multiple Sring by the help of this method eg. dog , cat etc
		saySomething("Dog");
		saySomething("Cat");
		saySomething("Im hungry mama , please give milk");
	}
	public static void saySomething(String s) {
	System.out.println(s);	
	}

}
