package cci.chapter1;

import java.util.Arrays;

/**
 * Write a method to decide if two strings are anagrams or not.
 */
public class Problem4 {

	// Time Complexity: O(nLogn)
	public static boolean solution1(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		char[] s1ToCharArray = s1.toCharArray();
		char[] s2ToCharArray = s2.toCharArray();
		
		Arrays.sort(s1ToCharArray);
		Arrays.sort(s2ToCharArray);
		
		/*for (int i = 0; i < s1.length(); i++) {
		if (s1ToCharArray[i] != s2ToCharArray[i]) {
			return false;
		}
	
		return true;*/
	
		return Arrays.equals(s1ToCharArray, s2ToCharArray);
	}
	
	public static boolean solution2(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		char[] s1ToCharArray = s1.toCharArray();
		char[] s2ToCharArray = s2.toCharArray();
		int[] counter = new int[26];//number of the letters in English alphabet
		
		for (int i = 0; i < s1ToCharArray.length; i++) {
			counter[s1ToCharArray[i]- 97]++;
			counter[s2ToCharArray[i]- 97]--;
		}
		
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(solution2("anab", "baan"));
	}

}
