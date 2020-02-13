package recursions;

public class Factorial_recursion {

	public static void main(String[] args) {
		
		int n = 5, factorial = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of "+n+" = "+factorial);
		System.out.println("Factorial of recursion = "+factorial_recursion(n));

	}
	
	public static int factorial_recursion(int n)
	{
		if(n==1)
			return 1;
		else
		{
			System.out.println("Recursive call "+(n-1));
			return n * factorial_recursion(n-1);
		}	
	}

}
