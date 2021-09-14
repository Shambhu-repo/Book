package com.callByValueAndCallByReferecnce;

public class CallByReference_Sriyank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.length = 20.1f;
		method2(r1); // method call by reference r1
		method1(r1);// method call by reference r1
		method3(r1);// method call by reference r1
		
		/* Question : Why even having reference r2 , r3 ,r4 etc , do we call method by r1
		only  ?
		
		Answer : There is 2 memory side in java : Heap and Stack  . Heap memory stores all the
		object . Stack memory stores all the primitive type data and references . Hence ,
		here only one objec of class  created in Heap memory .Let say object name is D1 .
		r1 is a reference which says where is object . This reference carries the properties 
		of object D1 . Now we have created multiple method like : method1 , method2, method3 
		. Multiple method has created multiple references like r1 , r2 , r3 , r4 etc. 
		Now we set the reference  r2.length= 20f . This r2 reference value will reflect
		through r1 only . Likewise refrence r3.length=30f; this value also reflects
		in r1 only . Thats why whatever we make modify the reference under multiple method
		these method will be called by reference which is created while creating object
		i.e r1 reference .   */
		

	}

	public static void method1(Rectangle r2) {

		r2.length = 20f;
		System.out.println("Area of rectangle : " + r2.length);
	}

	public static void method2(Rectangle r3) {
		r3.length = 30f;
		System.out.println("Area of rectangle : " + r3.length);

	}
	
	public static void method3(Rectangle r4) {
		r4.length=50f;
	}
}

class Rectangle {
	float length;
	float breath;

}
