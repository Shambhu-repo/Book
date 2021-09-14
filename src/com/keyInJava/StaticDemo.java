package com.keyInJava;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EMP sha = new EMP(); //  
	EMP nir= new EMP();
	/* Object reference can access any number of method created under same class . e.g : here 
	 * class EMP object reference 'sha' and 'nir' can access both method 'ShowMethod1' and 
	 * 'showMethod2' .  
	 *   Intresting : object 'nir' and 'sha' both automatically associate with constroctor
	 *   public EMP . Here is  only one print output for constructor .it prints two 
	 *   times on console . Because i have created two object reference sha and nir . it
	 *   means constructor automatically called to every one object creation . */
	
	sha.eid=23;
	sha.showMethod1();
	sha.ShowMethod2();
	nir.showMethod1();
	nir.ShowMethod2();
		

	}

}

class EMP{
	int eid;
	int salary;
	String ceo;
	
	
	public EMP() {
		System.out.println("EMP Condtructor");
		
	}
	
	public void showMethod1() {
		System.out.println("im showMethod1");
		
	}
	public void ShowMethod2() {
		System.out.println("Im ShowMethod2");
	}
}

