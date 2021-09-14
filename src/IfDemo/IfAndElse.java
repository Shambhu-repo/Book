package IfDemo;

public class IfAndElse {
	

	public static void main(String[] args) {
		HappyExam he = new HappyExam();
		he.calcultaion();
		he.calculation1();

	}
}

class HappyExam {
	int yourSales;
	int target;
	String performance;
	 double bonus;
	 String punishment;

	public void calcultaion() {
		yourSales = 150;
		target = 120;

		if (yourSales >= target) {
			performance = "Satisfactory";
			bonus = 100 + 0.01 * (yourSales - target);

		} 
		else {
			performance = "unsatisfactory";
			bonus = 0;
			
		}
		
		System.out.println(bonus);
		System.out.println(performance);

	}
	
	public void calculation1() {
		bonus = 200;
		yourSales = 120;
		if(bonus>yourSales) {
			performance="corruption";
			bonus=0;
			punishment = "Jail";
			
		}
		else {
			performance="investigation";
		}
		
		
		}
	
}
