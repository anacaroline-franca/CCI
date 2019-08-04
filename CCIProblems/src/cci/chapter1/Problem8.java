package cci.chapter1;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of
 * another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
 * only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 */
public class Problem8 {

	public static boolean solution1(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		s1 += s1;
		if (s2.length() > 0 && s1.contains(s2)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution1("apple", "pleap"));
	}
}
