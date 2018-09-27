package edu.negl.math;
import java.util.Scanner;

public class RunPair {
	
//	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter first number: ");
//		int aFirst = in.nextInt();
//		System.out.print("Enter second number: ");
//		int aSecond = in.nextInt();
//
//		Pair pair = new Pair(aFirst, aSecond);
//		int sum =  pair.getSum();
//		
//		System.out.println("Sum of numbers entered is " + sum);

	public static void main(String[] args) 

	{
		String[] data = { "abc", "def", "ghi", "jkl" };

		String searchedValue = "ghi";

		int pos = 0;

		boolean found = false;

		while (pos < data.length)

		{

		   if (data[pos].equals(searchedValue))

		   {

		      found = true;

		   }

		   else

		   {      

		      found = false;

		   }

		   pos++;

		}

		if (found) 

		{ 

		   System.out.println("Found at position: " + pos); 

		}

		else 

		{ 

		   System.out.println("Not found"); 

		}
		
	}


}
