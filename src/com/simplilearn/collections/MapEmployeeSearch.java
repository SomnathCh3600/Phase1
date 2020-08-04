package com.simplilearn.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class MapEmployeeSearch {
	public static void main(String[] args) {
		//Map is implemented to store a key, value pair of employee id and name respectively
		
		Map<Integer, String>empMap=new HashMap<Integer, String>();
		empMap.put(102, "Daniel Dutta");
		empMap.put(205, "Kevin Syiem");
		empMap.put(125, "Rupart Nongrum");
		empMap.put(325, "Brian D'souza");
		empMap.put(685, "Grahembell Paul");
		empMap.put(109, "Rose May");
		empMap.put(201, "Sheryl Nongkhlow");
		
	//Taking user input to search for an employee in the collection
		System.out.println("***Welcome to employee search portal***");
		System.out.println("Enter the Employee Id :");
		Scanner input=new Scanner(System.in);
		int id=input.nextInt();
		
		//Implementing the set interface to store the map and perform a check and match of key with the user input
		Set <Integer> allIds=empMap.keySet();
		int count=0;
		for(Integer key:allIds) {
			if(key.equals(id)) {
				System.out.println("The Employee is :"+empMap.get(key));
				count=1;
		}
		}
			if(count==0) {
				System.out.println("Employee Not found");
			}
		
			input.close();			//	command to close the scanner to avoid warning
	}

}
