package com.javatest;

import java.util.HashSet;
import java.util.Set;

/*Write a Java program to find all duplicate elements in an array.*/

public class FindDuplicate {

	public static void main(String[] args) {


		int[] numbers = {1,2,3,4,5,56,7,9,8};
		
		boolean hasDuplicate = false;
		Set<Integer> set = new HashSet<>();
		for(int nums : numbers) {
			if(!set.add(nums)) {
				hasDuplicate = true;
				break;
			}
		}
		if(hasDuplicate) {
			System.out.println("Array has duplicate numbers");
		}else {
			System.out.println("Array does not has duplicate numbers");
		}

	}

}
