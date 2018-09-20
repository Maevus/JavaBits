package edu.negl.shapes;
import java.util.Random;

public class LotteryPrinter {
	
	public static void main(String[] args)
	{
		Random generator = new Random();
		
		String lotteryNums = "";
		
		for (int i = 1;i < 7;i ++) {
			
			lotteryNums += generator.nextInt(49) + ", ";
			
		}
		
		System.out.println("Pick these winsome numbers: " + lotteryNums);
		
	}

}
