package com.simplilearn.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestAllSetNumbers {
	
	public static void main(String[] args) {
		Set <Double> priceSet=new HashSet<>();
		priceSet.add(121.20);
		priceSet.add(154.25);
		priceSet.add(999.89);
		priceSet.add(199.65);
		priceSet.add(66.986);
		priceSet.add(986.32);
		priceSet.add(959.699);
		priceSet.add(1254.325);
		System.out.println("Hash set of prices : "+priceSet);
		System.out.println("--------------------------------------------------------------------");
		
		//Duplicate entry not allowed && sorting of entry in ascending order
		Set <Float> setofTemperatures=new TreeSet<>();
		setofTemperatures.add(24F);
		setofTemperatures.add(36F);
		setofTemperatures.add(28F);
		setofTemperatures.add(18.8F);
		setofTemperatures.add(21.3F);
		setofTemperatures.add(36F);		//Duplicate entry
		setofTemperatures.add(48F);
		System.out.println("Tree set of temperatures : "+setofTemperatures);
		System.out.println("--------------------------------------------------------------------");
		
		//Duplicate entry not allowed && insertion order preserved
		Set <Integer> numberSet=new LinkedHashSet<>();
		numberSet.add(12);
		numberSet.add(13);
		numberSet.add(9);
		numberSet.add(9);		//Duplicate entry
		numberSet.add(5);
		numberSet.add(29);
		numberSet.add(10);
		System.out.println("Linked Hash set of Numbers : "+numberSet);
		System.out.println("--------------------------------------------------------------------");

	}

}
