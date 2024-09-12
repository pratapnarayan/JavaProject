package com.javatest;

import java.util.List;

public class FunctionalP01Functional {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,4,5,13,12,4,6,9);
		List<String> courses = List.of("Spring", "SpringBoot","API","AWS", "Azure", "Microservices", "PCF", "Docker", "Kubernetes");
		//printAllNumbersInListStructured(numbers);
		//printEvenNumbersInListStructured(numbers);
		//printOddNumbersInListStructured(numbers);
		
		//courses.stream().forEach(System.out::println);
		
		/*
		 * courses.stream() .filter(course -> course.contains("Spring"))
		 * .forEach(System.out::println);
		 */
		
		/*
		 * courses.stream() .filter(course -> course.length() > 4)
		 * .forEach(System.out::println);
		 */
		
		numbers.stream()
		.filter(number -> number%2 == 0)
		.map(number -> number*number)
		.forEach(System.out::println);
		
	}
	
	private static boolean isEven(int number) {
		return number%2 == 0;
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//numbers.stream().forEach(System.out::println);
	}
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 == 0)
		.forEach(System.out::println);
	}
	private static void printOddNumbersInListStructured(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 == 1)
		.forEach(System.out::println);
	}
}
