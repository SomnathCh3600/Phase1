package CalculatorDemo;

public class Calculator {

	//show the stored numbers
		public void showHistory(InputData input) {
			System.out.println("The numbers entered earlier are: "+input.getNumber1()+ "," + input.getNumber2());
		}
		
		//update number
			public void updateNumber(InputData input, int num1, int num2) {
			input.setNumber1(num1);
			input.setNumber2(num2);
			}
		
			//addition method
			public void addition(InputData input) {
			int add = input.getNumber1()+input.getNumber2();
			input.setTotalSum(add);	
			System.out.println("Sum of the numbers: "+input.getTotalSum());
		}
		
		//subtraction method
			public void subtraction(InputData input) {
				int diff= input.getNumber1()-input.getNumber2();
				input.setTotalDifference(diff);
				System.out.println("Difference of the numbers: "+input.getTotalDifference());
			}
		
		//multiplication method
				public void product(InputData input) {
					int product = input.getNumber1()*input.getNumber2();
					input.setTotalProduct(product);
					System.out.println("Product of the numbers: "+input.getTotalProduct());
				}
		
		//division function
					public void quotient(InputData input) {
						if(input.getNumber2()!=0){
						int quotient = input.getNumber1()/input.getNumber2();
						input.setTotalQuotient(quotient);
						System.out.println("Quotient of the numbers: "+input.getTotalQuotient());
						}
						else
						{
							System.out.println("A number is not divisible by 0");
						}
					}
	}

