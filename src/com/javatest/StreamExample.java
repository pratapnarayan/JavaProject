package com.javatest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(5,7,2,3,9,10,7,3,12,15);
		
		 nums.stream()
		 .map(element -> element*2)
		 .forEach(element ->System.out.println(element));
		 
		 //find out all the even numbers that exist in the list
		 List<Integer> evenList = nums.stream().filter(n -> n%2 == 1).collect(Collectors.toList());
		System.out.println(evenList);
		
		//Given a list of integers, find out all the numbers starting with 1 
		List<String> startWith = nums.stream().map(s -> s+"").filter(s -> s.startsWith("1")).collect(Collectors.toList());
		System.out.println(startWith);
		
		//How to find duplicate elements in a given integers list in java
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicate = nums.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		System.out.println(duplicate);
		
		//Find the first element of list
		System.out.println(nums.stream().findFirst().get());
		
		//Find max element
		System.out.println(nums.stream().max(Integer::compare).get());
		
		//Given a String, find the first non-repeated character 
		String input = "This is test";
		
		

	}

}
