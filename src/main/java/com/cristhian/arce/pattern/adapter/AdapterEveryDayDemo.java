package com.cristhian.arce.pattern.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEveryDayDemo {
	
	public static void main(String[] args) {
		Integer[] arrayOfInts = new Integer[] { 42, 43, 44};
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		
		System.out.println(arrayOfInts);
		System.out.println(listOfInts);
	}

}
