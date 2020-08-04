package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestAllListNumbers {

	public static void main(String[] args) {
		List <Double> priceList=new ArrayList<>();
		priceList.add(121.20);
		priceList.add(154.25);
		priceList.add(999.89);
		priceList.add(199.65);
		priceList.add(66.986);
		priceList.add(986.32);
		priceList.add(959.699);
		priceList.add(1254.325);
		System.out.println("Array List of prices : "+priceList);
		System.out.println("--------------------------------------------------------------------");
		
		List <Float> listofTemperatures=new Vector<>();
		listofTemperatures.add(24F);
		listofTemperatures.add(28F);
		listofTemperatures.add(18.8F);
		listofTemperatures.add(21.3F);
		listofTemperatures.add(36F);
		listofTemperatures.add(18.8F);
		listofTemperatures.add(48F);
		System.out.println("Vector list of temperatures : "+listofTemperatures);
		System.out.println("--------------------------------------------------------------------");
		
		List <Integer> listofDates=new LinkedList<>();
		listofDates.add(12);
		listofDates.add(13);
		listofDates.add(9);
		listofDates.add(5);
		listofDates.add(29);
		listofDates.add(9);
		listofDates.add(10);
		System.out.println("Linked list of Dates : "+listofDates);
		System.out.println("--------------------------------------------------------------------");
	}

}