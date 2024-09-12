package com.javatest;

/*Write a Java program to check if a given string is a palindrome or not.*/

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(checkPalindrome("121"));

	}
	
	public static boolean checkPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length()-1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }

}
