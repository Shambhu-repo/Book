package com.forLoopDemo;

public class FoorLoop {
int i ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i = 0; i<5; i++) { // it satifies its condtion and enter into second for loop
			                       // . in second for loop it loops whole number untill j<12
			                       // and it goes to first loop and continues ....
			System.out.println("Hello : " + i);
			
			for(int j = 2; j< 12; j++) {
				
				System.out.println("Im don :"  + j);
				
			}
			
			
		}

	}

}
