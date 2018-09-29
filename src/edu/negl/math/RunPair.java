package edu.negl.math;

import java.util.Scanner;

public class RunPair {

public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		
	System.out.print("Enter first number: ");
	int aFirst = in.nextInt();
	System.out.print("Enter second number: ");
	int aSecond = in.nextInt();

	Pair pair = new Pair(aFirst, aSecond);
	int sum =  pair.getSum();
	
	System.out.println("Sum of numbers entered is " + sum);

	}
}
