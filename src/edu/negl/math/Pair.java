package edu.negl.math;

public class Pair {
	private int aFirst;
	private int aSecond;

	public Pair(int aFirst, int aSecond) {
		this.aFirst = aFirst;
		this.aSecond = aSecond;

	}

	public int getSum() {
		return aFirst + aSecond;
	}
}