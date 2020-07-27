package com.simplilearn.accessmodifier;

public class Access {

	//Employee variable-ID (Private access)
		private int empId= 101;
		
		
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
