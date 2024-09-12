package com.javatest;

public class ReverseWords {

	  public static String reverseWords(String str) {
	    if (str == null || str.isEmpty()) {
	      return str;
	    }

	    String[] words = str.split(" ");
	    StringBuilder reversedString = new StringBuilder();

	    for (int i = words.length - 1; i >= 0; i--) {
	      reversedString.append(words[i]).append(" ");
	    }

	    return reversedString.toString().trim();
	  }

	  public static void main(String[] args) {
	    String sentence = "This is a test string";
	    //String reversedSentence = reverseWords(sentence);
	    //String input = "Good";
	    
	    //Using CharAt method
	    String s1="goodmorning",rev="";
	    int length = s1.length();
	    
	    for (int i=length-1;i>=0;i--) {
	    	rev +=s1.charAt(i);
	    }
	    System.out.println("Reverse words using charAt>>>>>>>>>>>>"+rev);
	    
	    System.out.println("Test for reverse word>>>> "+reverseWords(sentence));
	    String reversed = new StringBuilder(sentence).reverse().toString();
	    System.out.println(reversed);
	    System.out.println("Original sentence: " + sentence);
	    System.out.println("Reversed sentence: " + reversed);
	  }
	}
