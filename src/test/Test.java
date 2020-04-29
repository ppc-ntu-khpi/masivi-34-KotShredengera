package test;

import java.util.Arrays;

import calculate.Exercise;

/**
 * Calculation and output of results. Has implementation of static main ()
 * method.
 * 
 * @author Kot_Shredingera
 *
 */
public class Test {
	/**
	 * Runs when compiling a program. Calculation results for different arguments on
	 * the screen.
	 * 
	 * @param args program startup option
	 */
	public static void main(String[] args) {
		int N = 5, M = 8;

		for (int[] row : Exercise.Calculate(N, M))
			System.out.println(Arrays.toString(row));
	}
}
