package cci.chapter1;

import java.util.Stack;

/**
 * Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
 * five characters, including the null character.)
 */
public class Problem2 {
	
	// Iterative --> Time complexity : O(n)// Auxiliary Space : O(1)
	public static String solution1(String s) {
		if (s.isEmpty() || s.length() == 1) {
			return s;
		}
		
		StringBuilder sReverse = new StringBuilder();
		
		for (int i = s.length() - 1; i >= 0; i--) {
			sReverse.append(s.charAt(i));
		}
		
		return sReverse.toString();
	}
	
	// Using stack --> Time complexity : O(n)// Auxiliary Space : O(n)
	public static String solution2 (String s) {
		if (s.isEmpty() || s.length() == 1) {
			return s;
		}
		
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		
		StringBuilder sReverse = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sReverse.append(stack.pop());
		}
		
		return sReverse.toString();
	}
	
	// Iterative using two pointers --> Time complexity : O(n)// Auxiliary Space : O(1)
	public static String reverseStringBookSolution(String s) {
		if (s.isEmpty() || s.length() == 1) {
			return s;
		}
		
		char[] sToCharArray = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		
		while (j > i) {
			char aux = sToCharArray[i];
			sToCharArray[i] = sToCharArray[j];
			sToCharArray[j] = aux;
			i++;
			j--;
		}
		
		return String.valueOf(sToCharArray);
	}
	
	
	public static void main(String[] args) {
		System.out.println(solution1("abcd"));
		System.out.println(solution2("abcd"));
		System.out.println(reverseStringBookSolution("abcd"));
	}
}
