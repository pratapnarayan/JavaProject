package com.javatest;

/*Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three, print “Fizz” instead of the number, 
 * and for the multiples of five, print “Buzz”. 
 * For numbers that are multiples of both three and five, print “FizzBuzz”.
 * */

public class FizzBuzzProblem {

	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("Number : "+i+" FizzBuzz");
			}else if(i%3 == 0) {
				System.out.println("Number : "+i+" Fizz");
			}else if(i%5 == 0) {
				System.out.println("Number : "+i+" Buzz");
			}
		}



	}

}
