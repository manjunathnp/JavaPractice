package com.javapractice;

public class Employee 
{
	int empID;
	String empName;
	int deptNo;
	static String companyName;
	
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		emp1.empID = 101;
		emp1.empName = "Sachin";
		emp1.deptNo = 10;
		Employee.companyName = "BCCI";
		
		Employee emp2 = new Employee();
		emp2.empID = 102;
		emp2.empName = "Dravid";
		emp2.deptNo = 20;
		Employee.companyName = "BCCI";
		
		Employee emp3 = new Employee();
		emp3.empID = 103;
		emp3.empName = "Ganguly";
		emp3.deptNo = 30;
		Employee.companyName = "BCCI";
		
		System.out.println("Employee 1 - Details:");
		System.out.println(emp1.empID+" || "+emp1.empName+" || "+emp1.deptNo+" || "+Employee.companyName);
		
		System.out.println("Employee 2 - Details:");
		System.out.println(emp2.empID+" || "+emp2.empName+" || "+emp2.deptNo+" || "+Employee.companyName);
		
		System.out.println("Employee 3 - Details:");
		System.out.println(emp3.empID+" || "+emp3.empName+" || "+emp3.deptNo+" || "+Employee.companyName);
	}

}
