
public class FactorialRecursion {
	
	public static void main(String args[]) {
		System.out.println(factorial(3)); 
		//new Game();
	}
	
	private static int factorial(int n) {
		//if (n == 1) return 1;
		return n == 1 ? 1 : n * factorial(n - 1);
	}

}
