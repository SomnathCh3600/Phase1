package com.simplilearn.accessmodifier;

class Details{
	//Employee variable-ID (Private access)
	private int empId= 101;
	
//	//Employee method
//	private void showId() {
//		System.out.println("Employee ID is :"+empId);
//	}
	
	//Public Method to access the private variable
	public int getId() {
		return empId;
	}
	//Employee variable-Name (Public Access)
		public String empName="Mukesh Bhatt";
		
		//Employee method-Name (Public access)
		public String getEmpName(){
				return empName;
		}
		
	//Employee variable-Salary (Protected access)
	protected double empSalary=50000;
	
	//Employee method-Salary (Protected access)
	protected double showSalary(){
		return empSalary;
	}
	
	
}
public class Employee {

	public static void main(String[] args) {
		Details emp=new Details();
		
		System.out.println("Employee ID: "+emp.getId());
		System.out.println("Employee Name: "+emp.empName);
		System.out.println("Employee Salary: "+emp.empSalary);
		
			
		

	}

}
