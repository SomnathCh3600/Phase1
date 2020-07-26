package com.simplilearn.typecasting;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		
		//Taking input from the user
		System.out.print("Enter the number of mangoes that you purchased: ");
		
		int numberOfMango=input.nextInt(); //Storing the input in numberOfMango
		
		float mangoFloat=numberOfMango; //Implicit type casting
		double decimalMango=mangoFloat;	// Implicit Type casting
		byte mangoBite=(byte)decimalMango; //Explicit Type casting
		 
		//Printing the type casted vales in the console
		
		System.out.println("Number of mangoes in Float: "+mangoFloat);
		System.out.println("Number of mangoes in Double: "+decimalMango);
		
		//Condition to check if the user has given the correct input to obtain the right result
		
		if(mangoBite!=numberOfMango)		
		System.out.println("Please enter a value within 125 to see the byte value");
		else
		System.out.println("Number of mangoes in Byte: "+mangoBite);

	}

}
