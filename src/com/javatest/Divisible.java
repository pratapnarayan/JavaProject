package com.javatest;

public class Divisible {

	public static void main(String[] args) {
		int [] naturalArr = new int[100];
		
		int [] lhArr = new int[naturalArr.length/2];
		int [] rhArr = new int[naturalArr.length/2+1];
		
		checkDivisible(lhArr);

	}
	
	public static void checkDivisible(int [] arr) {
		
		for (int i =0; i<arr.length-1;i++) {
			if((arr[i] % 3) == 0 && (arr[i] % 5== 0)) {
				System.out.println(arr[i]);
				break;
			}
			
		} 
		
		
	}

}
