package com.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrList = new ArrayList<String>();
		
		arrList.add("John");
		arrList.add("Lina");
		arrList.add("Lisad");
		arrList.add("Elsa");
		arrList.add("One");
		arrList.add("OneAndOnly");
		arrList.add("Derek");
		arrList.add("Change");
		arrList.add("factory");
		arrList.add("justBefore");
		arrList.add("Italy");
		arrList.add("Italy");
		arrList.add("Thursday");
		arrList.add("");
		arrList.add("");
		
		long count = arrList.stream().distinct().count();
		System.out.println("Count Value>>>>> "+count);
		
		//Iteration
		boolean isExist = arrList.stream().anyMatch(element -> element.contains("a"));
		System.out.println("Boolean Value>>>>> "+isExist);

		//Filter
		Stream<String> stream = arrList.stream().filter(element -> element.contains("d"));
		System.out.println("Filter Stream>>>>>>>>>>> "+stream.count());
		
		List<Integer> inte = Arrays.asList(1,2,3,4,5);
		Integer red = inte.stream().reduce(20, (a,b) -> a + b);
		System.out.println("reduced value>>>>> "+red);
		
		List<String> resultList = arrList.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		
		for (String value : resultList) {
			System.out.println("value from resultList>>>> "+value);
		}
		
	}

}
