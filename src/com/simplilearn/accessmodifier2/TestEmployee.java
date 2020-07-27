package com.simplilearn.accessmodifier2;

import com.simplilearn.accessmodifier.Access;

public class TestEmployee extends Access {

	public static void main(String[] args) {
		
		//Access object public property
		Access accessEmp=new Access();
		
		System.out.println("Employee ID: "+accessEmp.getId());
		System.out.println("Employee Name: "+accessEmp.getEmpName());
		
		//Access protected property
		
		TestEmployee testEmpSalary=new TestEmployee();
		
		System.out.println("Employee Salary: "+testEmpSalary.showSalary());
		
		}
	}


