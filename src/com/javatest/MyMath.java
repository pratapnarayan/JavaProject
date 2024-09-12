package com.javatest;

import java.util.ArrayList;
import java.util.List;

public class MyMath {
	
	//{1,2,3,4} => 10
	
	public int calculateTotal(int[] numbers ) {
		
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.add(5);
		list.add(6);
		
		System.out.println(arr.length);
		System.out.println(list.size());
	}

}
