package com.keyInJava;
 /*static key can be use in : 1. class level variabale but not in local variable
  *  2.in  method  3. Static block can be  created 4. can be used in nested classes but 
  *  not in outer classes*/
public class StaticdKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticExample se = new StaticExample(10,100,"Sumedhya");
		se.showStatic();
		StaticExample se1= new StaticExample(11,102,"Sidhaarth");
		se1.showStatic();
		
    
	}

}

class StaticExample{
	int eid;
	int salary;
	String name;
	 static String ceo = "Shuravi";
	 
	 public StaticExample(int eid, int salary, String name) {
		 this.eid=eid;
		 this.name=name;
		 this.salary=salary;
		 
		 
	 }
//		 }
	 
	
	
	public void showStatic() {
		
		System.out.println(eid +","+salary+ "," + name + " ," + ceo);
		
	}
	
}
