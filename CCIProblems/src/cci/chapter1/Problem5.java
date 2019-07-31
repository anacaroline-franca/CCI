package cci.chapter1;

/**
 * Write a method to replace all spaces in a string with ‘%20’
 */
public class Problem5 {

	public static String solution1(String s1) {
		int counterSpaces = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') counterSpaces++;
		}
		
		char[] result = new char[s1.length() + 2 * counterSpaces];
		
		int resultPointer = result.length - 1;
		for (int i = s1.length()-1; i >= 0; i--) {
			if (s1.charAt(i) == ' ') {
				result[resultPointer] = '0';
				result[resultPointer - 1] = '2';
				result[resultPointer - 2] = '%';
				
				resultPointer -= 3;
			} else {
				result[resultPointer] = s1.charAt(i);
				resultPointer--;
			}
		}
		
		return String.valueOf(result);
	}
	
	public static void main(String[] args) {
		System.out.println(solution1("a bc"));
	}

}
