package com.simplilearn.typecasting;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		
		//Taking input from the user
		System.out.print("Enter the number of mangoes that you purchased: ");
	
		String numberOfMango=input.nextLine(); //Storing the input in numberOfMango
		
		int mangoInteger=Integer.parseInt(numberOfMango); // Wrapper class conversion
		
		float mangoFloat=mangoInteger; //Implicit type casting
		
		double decimalMango=Double.parseDouble(numberOfMango);	// Wrapper class conversion
		
		byte mangoBite=(byte)decimalMango; //Explicit Type casting
		 
		//Printing the type casted vales in the console
		
		System.out.println("Number of mangoes in Integer: "+mangoInteger);
		
		System.out.println("Number of mangoes in Float: "+mangoFloat);
		
		System.out.println("Number of mangoes in Decimal: "+decimalMango);
		
		//Condition to check if the user has given the correct input to obtain the right result
		
		if(mangoBite!=mangoInteger)		
		System.out.println("Please enter a value within 125 to see the byte value");
		else
		System.out.println("Number of mangoes in Byte: "+mangoBite);

	}

}
