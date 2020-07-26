package com.simplilearn.typecasting;

public class ExplicitTypeCast {

	public static void main(String[] args) {
		
		double price = 100.49;
		long biggerPrice=(long)price;
		int priceInteger=(int)price;
		byte priceByte=(byte)price;
		//char firstCharacter
		
		System.out.println("Double :"+price);
		System.out.println("long :"+biggerPrice);
		System.out.println("int :"+priceInteger);
		System.out.println("Byte :"+priceByte);

	}

}
