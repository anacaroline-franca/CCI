package cci.chapter1;

import java.util.HashSet;
import java.util.Set;

/**
 * Design an algorithm and write code to remove the duplicate characters in a string
 * without using any additional buffer. NOTE: One or two additional variables are fine.
 * An extra copy of the array is not.
 */
public class Problem3 {

	public static String solution1(String s) {
		StringBuffer sWithoutRepetition = new StringBuffer();
		Set<Character> charsSet = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char currChar = s.charAt(i);
			if (!charsSet.contains(currChar)) {
				charsSet.add(currChar);
				sWithoutRepetition.append(currChar);
			}
		}
		
		return sWithoutRepetition.toString();
	}
	
	// Algorithm—With Additional Memory of Constant Size 
	public static String removeDuplicatesBookSolution1(String s) {
		char[] str = s.toCharArray();
		
		if (str == null) return null;
		
		int len = str.length;
		
		if (len < 2) return String.valueOf(str);
		
		boolean[] hit = new boolean[256];
		
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		
		hit[str[0]] = true;
		
		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		
		str[tail] = 0; 
		return String.valueOf(str);
	}
	public static void main(String[] args) {
		System.out.println(removeDuplicatesBookSolution1("aabcdeee"));
	}

}
