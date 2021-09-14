package com.employee;

import java.util.Date;
import java.util.GregorianCalendar;
// page number 124
public class Employee {
	
//	private String name;
//	private double salary;
//	private Date hireDay;

	public Employee(String n , double s,int year , int month , int day) { // constructor
		name = n;
		salary=s;
		
		
		
		GregorianCalendar calender = new GregorianCalendar(year,month-1,day);
		hireDay=calender.getTime();
	
		}
	public String getName() {  // method for name
		return name;
	}
	public double getSalary() { // method for salary
		return salary;
	}
	public Date getHireDay() {
		return hireDay;
	}
	
	public void raisSalary(double byPercent) { // non return method and passing parameter here
		                                      // here in byPercent , we can use any argument 
		                                      // while printing the result )
		double raise = salary * byPercent/100;
		salary += raise;
	}
	
//	public Double raisSalary() { // method for raiseSalary 
//		return raiseSalary;
//	}
	private String name;
	private double salary;
	private Date hireDay;
	//private double raiseSalary=  salary + (5*salary/100);
}


