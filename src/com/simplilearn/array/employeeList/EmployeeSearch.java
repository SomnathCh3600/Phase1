package com.simplilearn.array.employeeList;

import java.util.Scanner;

public class EmployeeSearch {

	public static void main(String[] args) {
		
			
			String empList[]= {"Rajesh","Raman", "Rohit","Shweta", "Amy","Marry","Mukesh","Rahul","Charu","Venugopal"};
			
			System.out.println("****Welcome to employee search engine****");
			Scanner input=new Scanner(System.in);
			
			System.out.println("Please enter the name of the employee : ");
			String emp=input.nextLine();
		
			
			int count=0;
			for(int i=0; i<empList.length; i++) {
				if(empList[i].equals(emp))
				{
					System.out.println("The Employee, "+empList[i]+" is available at entry "+(i+1));
					count=1;
				}
			}
				if(count==0) {
					System.out.println("No search found!!");
				}

	}

}
