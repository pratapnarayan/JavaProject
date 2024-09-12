package com.javatest;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {

		String str = "Hello This is test for duplicate Element.";
		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println("Character : "+entry.getKey() + " Value : " + entry.getValue());
			}
		}
		
		// Using Streams
		
		Map<Character, Long> charCounts = str.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		charCounts.entrySet().stream()
		.filter(entry -> entry.getValue() > 1)
		.forEach(entry -> System.out.println("Character Stream : " + entry.getKey() + " Occurence : "+entry.getValue()));

	}

}
