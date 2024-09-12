package com.javatest;

import java.util.Arrays;

/*Write a Java function to find the longest common prefix string amongst an array of strings.*/

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" }; // Example array of strings
		String[] strs1 = { "flower", "flower", "flower", "flower" };
		// String longestPrefix = longestCommonPrefix(strs);

		/*
		 * String res = strs[0];
		 * 
		 * for(int i = 1; i < strs.length; i++) { res = commonPrefix(res, strs[i]); }
		 */

		System.out.println(commonPrefix(strs1));

		// System.out.println("Longest common prefix: " + res);
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return ""; // If the array is empty or null, return an empty string
		}
		String prefix = strs[0]; // Initialize prefix with the first string in the array
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1); // Reduce prefix length until it matches
				if (prefix.isEmpty()) {
					return ""; // If prefix becomes empty, return an empty string
				}
			}
		}
		return prefix; // Return the longest common prefix
	}

	public static String commonPrefix(String[] str) {
		if (str == null || str.length == 0) {
			return "";
		}
		Arrays.sort(str);
		String str1 = str[0];
		String str2 = str[str.length - 1];

		int index = 0;

		while (index < str.length) {
			if (str1.charAt(index) == str2.charAt(index)) {
				index++;
			} else {
				break;
			}

		}
		return index == 0 ? "" : str1.substring(0, index);

	}

	/*
	 * int n = Math.min(s1.length(), s2.length());
	 * StringBuilder result = new StringBuilder();
	 * for(int i = 0; i < n; i++) {
	 * if(s1.charAt(i) == s1.charAt(i)) {
	 * result.append(s1.charAt(i));
	 * }
	 * else {
	 * break;
	 * }
	 * }
	 * 
	 * return result.toString();
	 * }
	 */

}
