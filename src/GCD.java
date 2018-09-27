
class GCD {
	// Recursive function to return gcd of a and b
	static int gcd(int a, int b) {
		// Everything divides 0
		if (a == 0 || b == 0)
			return 0;

		// base case
		if (a == b)
			return a;

		// a is greater
		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}

	// Driver method
	public static void main(String[] args) {
		int a = 3151, b = 3151;
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
	}
}
