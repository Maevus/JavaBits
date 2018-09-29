package edu.negl.math;

import java.util.Scanner;

public class RunEntropy {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of probabilities to be tested for entropy: ");
		int entries = in.nextInt();
		
		if (entries == 2) {
			System.out.print("Enter first number: ");
			double aFirst = in.nextDouble();
			System.out.print("Enter second number: ");
			double aSecond = in.nextDouble();

			Entropy ent = new Entropy(aFirst, aSecond);
			System.out.println("Entropy of number entered is " + ent.getEntropy());
			
		} else if (entries == 3) {
			System.out.print("Enter first number: ");
			double aFirst = in.nextDouble();
			System.out.print("Enter second number: ");
			double aSecond = in.nextDouble();
			System.out.print("Enter third number: ");
			double aThird = in.nextDouble();

			Entropy ent = new Entropy(aFirst, aSecond, aThird);
			System.out.println("Entropy of number entered is " + ent.getEntropy());
		} else {
			System.out.println("number of entries not recognised, enter 2 or 3");
		}
		
		in.close();
		

	}
}