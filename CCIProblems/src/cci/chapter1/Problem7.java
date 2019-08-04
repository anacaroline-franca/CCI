package cci.chapter1;

import java.util.Arrays;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column is set to 0.
 */
public class Problem7 {

	public static int[][] solution1(int[][] matrix) {
		// Identify rows and columns with zero
		boolean[] rows = new boolean[matrix.length];
		boolean[] columns = new boolean[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					columns[j] = true;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (rows[i] || columns[j])
					matrix[i][j] = 0;
			}
		}
		
		return matrix;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{0, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		int[][] result = solution1(matrix);
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}
}
