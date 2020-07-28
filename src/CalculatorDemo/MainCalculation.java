package CalculatorDemo;

public class MainCalculation {

	public static void main(String[] args) {
		
		//Object created for taking input
		InputData input=new InputData(50,0);
		
		//Object created to perform the calculation
		Calculator calc=new Calculator();
		
		//calling a function to show the entered numbers
		calc.showHistory(input);
		
		//calling a function to show the sum of numbers
		calc.addition(input);
		
		//calling a function to show the difference of numbers
		calc.subtraction(input);
		
		//calling a function to show the product of numbers
		calc.product(input);
		
		//calling a function to show the quotient of numbers
		calc.quotient(input);
	
	}

}

