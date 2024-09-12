package com.javatest;

public class CountWords {
	
	public static int countWordsInSentence(String sentence) {
		if(sentence == null || sentence.isEmpty()) {
			return 0;
		}
		String[] words = sentence.split("\\s+");
		return words.length;
	}

	static public void main(String[] args) {
		
		String sentence = "This program defines a method countWords that takes"
				+ " a sentence as input and splits it into words using whitespace as the delimiter";
		int count = countWordsInSentence(sentence);
		System.out.println(count);

	}

}
