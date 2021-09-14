package com.whileLoop;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhileLoopExample we = new WhileLoopExample(100,"Shambhu");
		we.whileLMethod();

	}

}

class WhileLoopExample{
	double salary = 12;
	int year = 20 ;
     int i;
	String s ;
	double bonus = (salary*0.5*year)/100;
	
	
	public WhileLoopExample(int i , String s) {
		this.i=i;
		this.s=s;
		
	}
	
	public void whileLMethod() {
		
		System.out.println(" Before While loop");
		
		//while loop creation
		while(bonus<salary) {
			salary*=year;
			
			
			System.out.println(salary);
			break;
			
		}
		while(s.matches("Shambhu")) {
			
			System.out.println("Yes im matched with Shambhu , welcome");
			break;
		}
		
			while(s.matches("Shambhu")) {
				System.out.println("Uff ! Whats wrong uncle");
				break;
				
		}
			
		}
		
	}
	

