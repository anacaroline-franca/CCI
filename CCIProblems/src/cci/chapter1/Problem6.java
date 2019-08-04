package cci.chapter1;

import java.util.Arrays;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class Problem6 {

	public static int[][] solution1(int[][] matrix, int n) {
		int[][] aux = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int newLine = j;
				int newColumn = n - 1 - i;
				aux[newLine][newColumn] = matrix[i][j];
			}
		}
		
		return aux;
	}
	
	public static int[][] bookSolution1(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			
			System.out.println("first: " + first + " last: " + last);
			
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				
				System.out.println("offset: " + offset);
				
				int top = matrix[first][i]; // save top
				// left -> top
				matrix[first][i] = matrix[last-offset][first];
				System.out.println("[" + first + "][" + i + "] to [" + (last-offset) + "][" + first + "]");
			
				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset];
				System.out.println("[" + (last-offset) + "][" + first + "] to [" + (last) + "][" + (last - offset) + "]");

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				System.out.println("[" + (last) + "][" + (last - offset) + "] to [" + (i) + "][" + (last) + "]");

				// top -> right
				matrix[i][last] = top; // right <- saved top
				System.out.println("[" + (i) + "][" + (last) + "] = " + top);
				
				System.out.println("");
				
				for (int j = 0; j < n; j++) {
					System.out.println(Arrays.toString(matrix[j]));
				}
				
				System.out.println("");
			}
		}
		
		return matrix;
	}
	
	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		int[][] result = bookSolution1(matrix, n);
		
		
	}
}
