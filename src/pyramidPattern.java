// Java Program to Print the Pyramid pattern

// Main class

import java.util.Scanner;

public class pyramidPattern {

	// Main driver method
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);

        //user input for value num
        System.out.print("Enter num:"); //num=5,x=0
		int num = sc.nextInt();

         //user input for value x
        System.out.print("Enter x:");
		int x=sc.nextInt();

		// Outer loop for rows
		for (int i = 1; i <= num; i++) {
			x = i - 1;

			// inner loop for "i"th row printing
			for (int j = i; j <= num - 1; j++) {

				// First Number Space
				System.out.print(" ");

				// Space between Numbers
				System.out.print(" ");
			}

			// Pyramid printing
			for (int j = 0; j <= x; j++)
				System.out.print((i + j) < 10
									? (i + j) + " "
									: (i + j) + " ");

			for (int j = 1; j <= x; j++)
				System.out.print((i + x - j) < 10
									? (i + x - j) + " "
									: (i + x - j) + " ");

			// By now we reach end for one row, so
			// new line to switch to next
			System.out.println();
		}
	}
}
