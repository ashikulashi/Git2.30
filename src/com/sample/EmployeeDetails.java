package com.sample;

public class EmployeeDetails {
	
	//To create a method
	private void employeeId() {
		System.out.println("Employee Id is 7678567");

	}
	private void employeeName() {
		System.out.println("Employee Name is Deepthi");

	}
	//To create a main method
	public static void main(String[] args) {
		
		//To create a object
		//ClassName objRef=new ClassName();
		EmployeeDetails e=new EmployeeDetails();
		
		//To call a method
		//objRef.methodName;
		e.employeeId();
		e.employeeName();
		
	}

}
