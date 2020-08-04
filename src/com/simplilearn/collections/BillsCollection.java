package com.simplilearn.collections;

import java.util.Map;
import java.util.TreeMap;

public class BillsCollection {

	public static void main(String[] args) {
		
		//Map is implemented to store a key, value pair of Bill price and Bil name respectively
		Map<Double, String>priceMap=new TreeMap<Double, String>();
		priceMap.put(1568.25, "Mobile Bill");
		priceMap.put(750.0, "Internet Bill");
		priceMap.put(5023.69, "Grocery Bill");
		priceMap.put(756.65, "Electricity Bill");
		priceMap.put(300.25, "Water Bill");
		priceMap.put(3275.98, "Fuel Bill");
		priceMap.put(399.99, "Dish TV Bill");
		System.out.println("----------------Welcome to your Bill Maintenace Portal----------------");
		System.out.println("=========================================================================");
		
		// The Map.entrySet method is implemented to return a collection-view of the map, whose elements are of this class.
		for(Map.Entry<Double, String> price: priceMap.entrySet()) {
			System.out.println(price.getKey()+" , "+price.getValue());
		}
	}

}
