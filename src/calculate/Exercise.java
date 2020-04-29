package calculate;

import java.util.Arrays;

/**
 * Calculation and nesting of results
 * 
 * @author Kot_Shredingera
 *
 */
public class Exercise {
	/**
	 * Adding two matrix
	 * 
	 * @param N number of lines
	 * @param M number of columns
	 * @return array
	 */
	public static int[][] Calculate(int N, int M) {

		int[][] array1 = new int[N][M];
		int[][] array2 = new int[N][M];
		int[][] array3 = new int[N][M];

		System.out.println("First matrix:");
		for (int[] row : array1) {

			Arrays.fill(row, (int) (Math.random() * 10));
			System.out.println(Arrays.toString(row));

		}

		System.out.println("\nSecond matrix:");
		for (int[] row : array2) {

			Arrays.fill(row, (int) (Math.random() * 10));
			System.out.println(Arrays.toString(row));

		}

		System.out.println("\nSum of matrix");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				array3[i][j] = array1[i][j] + array2[i][j];

			}
		}

		return array3;
	}
}