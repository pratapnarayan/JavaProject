package com.javatest;

import java.lang.reflect.Array;

public class MissingNumber {

	public static void main(String[] args) {
		Solution s = new Solution();
		//Array[] arr = {1,2,3,5};
		//s.missingNumber(5, {1,2,3,5});
		int b = 5;
		int c = 7;
		
		int a = b+++c;
		System.out.println("value of a>> "+a);
		System.out.println("value of b>> "+b);

	}

}

class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        //The total sum of the array with all the numbers 
        
        int total = n*(n+1)/2;
        
        //Sum of numbers in array
        int sumOfArr = 0;
        
        for(int i=0; i<arr.length;i++) {
            sumOfArr += arr[i];
        }
        
        return total -sumOfArr;
    }
}
