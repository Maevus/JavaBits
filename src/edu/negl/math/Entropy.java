package edu.negl.math;

import java.math.*;

public class Entropy {

	private double aFirst;
	private double aSecond;
	private double aThird;
	
	private int numEntries;

	public Entropy(double aFirst, double aSecond) {
		this.aFirst = aFirst;
		this.aSecond = aSecond;
		this.numEntries = 2;
	}
	
	public Entropy(double aFirst, double aSecond, double aThird) {
		this.aFirst = aFirst;
		this.aSecond = aSecond;
		this.aThird = aThird;
		this.numEntries = 3;
	}

	/**
	 * method returning the entropy of two floats
	 * @return double entropy
	 */
	
	public double getEntropy() {
		
		if (this.numEntries == 2) {
			return -1*((aFirst * (aFirst)) + (aSecond * log2(aSecond)));					
		} else if (this.numEntries == 3) {
			return -1*((aFirst * (aFirst)) + (aSecond * log2(aSecond)) + (aThird * log2(aThird)));					
		} else {
			return 15462313;
		}
		
	}
	
	/**
	 * @param float to get base 2 of 
	 * @return log base 2 of given number
	 */
	public static double log2(double d) {
		return Math.log(d) / Math.log(2.0);
	}

}
