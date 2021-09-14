package com.employee;
//page No. 124
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee []staff = new Employee [3];  // i creat employee array by the name of constructor
		staff[0] = new Employee("Carl Cracker", 75000 , 1987,12,15);
		staff[1] = new Employee("Harry Doger", 75001 , 1988,10,1);
		staff[2] = new Employee("Tony Tester", 75002 , 1989,3,15);
		
		for(Employee e : staff) {  // enhanced : for loop used
			e.raisSalary(10); // increase salary by 10 % for all employee .
			
		}
		for (Employee e: staff) { // print all employees information .
			System.out.println("name : " + e.getName() + ", salary: " + e.getSalary() + " ,hireDay: " + e.getHireDay() );
		}
		

	}

}
