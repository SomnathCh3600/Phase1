package com.simplilearn.array.checklist;

import java.util.Scanner;

public class Checklist {

	public static void main(String[] args) {
		
		String checkList[]= {"RICE","WHEAT","DAL","SPICES","BISCUITS","OIL","ONION","PULSES","CHIPS"};
		
		System.out.println("****Welcome to your personalised check list application****");
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the name of the item to view it in your check list: ");
		String item=input.nextLine();
		String caseChange=item.toUpperCase();
		
		int count=0;
		for(int i=0; i<checkList.length; i++) {
			if(checkList[i].equals(caseChange))
			{
				System.out.println("The item "+checkList[i]+" is available at entry "+(i+1));
				count=1;
			}
		}
			if(count==0) {
				System.out.println("The item you entered is not available in the checklist, kindly get it from the grocery");
			}
		}
		

	}


