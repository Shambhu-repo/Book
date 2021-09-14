package com.callByValueAndCallByReferecnce;

public class CallByValue_Sriyank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10; // Primitive data type,  it stores in stack memory  like (int i = 10).
		// Method invoked 
		callByValue(i);// now callByValue method (parameter) get value of ( int i = 10 ).

		System.out.println(i);
	}
	
	public static void callByValue(int j) {  // when this method get value of i . it also 
		                                      //stores in stack memory like (int j = 10 )
		
		j=100; // it also stores in stack memory like ( j = 100; ) . This value is free from 
		       // predifinded primitive type i value . it doesnot affect value of i 
	
		
	}

}
