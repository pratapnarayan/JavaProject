package com.javatest;

import java.util.List;

public class FunctionalP01Structured {
	
	public static void main(String[] args) {
		
		printAllNumbersInListStructured(List.of(12,4,5,13,12,4,6,9));
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for(int number : numbers) {
			System.out.println(number);
		}
	}
}
