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
	public static byte[][] Calculate(int N, int M) {

		byte[][] array1 = new byte[N][M];
		byte[][] array2 = new byte[N][M];
		byte[][] array3 = new byte[N][M];

		System.out.println("First matrix:");
		for (byte[] row : array1) {

			Arrays.fill(row, (byte) (Math.random() * 20));
			System.out.println(Arrays.toString(row));

		}

		System.out.println("\nSecond matrix:");
		for (byte[] row : array2) {

			Arrays.fill(row, (byte) (Math.random() * 20));
			System.out.println(Arrays.toString(row));

		}

		System.out.println("\nSum of matrix");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				array3[i][j] = (byte) (array1[i][j] + array2[i][j]);

			}
		}

		return array3;
	}
}