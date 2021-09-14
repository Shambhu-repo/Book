package com.keyInJava;

public class StudentStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Shuravi",1);
				s.showStudent();
				Student s1 = new Student("Sumedhya", 2);
				s1.showStudent();
		

	}

}

class Student{
	String name; int roll;  static int grade= 10;   static String sname = "snn";
	
	
	public Student(String name , int roll ) {
		this.name=name;
		this.roll=roll;
}
	public void showStudent() {
		System.out.println("My name is " + name + ". Roll number:" + roll + " I read in "+ grade + ". Scholl name :" + sname);
		
	}
}