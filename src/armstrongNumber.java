// JAVA program to find Armstrong
// numbers between two integers
//import java.io.*;
//import java.math.*;

import java.util.Scanner;

class armstrongNumber {

	// Function to print Armstrong
	// Numbers between two integers
	static void ArmstrongNum(int l, int h)
	{
		for (int j = l + 1; j < h; ++j) {

			// Calculating number of digits
			int y = j;
			int N = 0;
			while (y != 0) {
				y /= 10;
				++N;
			}

			// Calculating the sum of nth
			// power of all the digits
			int sum_power = 0;
			y = j;
			while (y != 0) {
				int d = y % 10;
				sum_power += Math.pow(d, N);
				y /= 10;
			}

			// Checking if the current number
			// i is equal to the sum of nth
			// power of all the digits
			if (sum_power == j)
				System.out.print(j + " ");
		}
	}

	// The Driver code
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);

		System.out.print("Enter n1:");
		int n1 = input.nextInt();
		System.out.print("Enter n2:");
		int n2 = input.nextInt();
		ArmstrongNum(n1, n2);
		System.out.println();
	}
}
