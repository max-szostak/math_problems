import java.util.Scanner;
public class Wilsons {
	//Uses formula to determine primes. Cannot generate more than 8 due to excessive runtime.
	
	public static double factorial(double n)
	{
		//Calculates n!
		for (double i = n - 1; i > 1; i--)
			n *= i;
		return n;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (double i = 1.0; i < 2E10; i++)
		{
			double prime = ((int) (factorial(i) % (i + 1) / i)) * (i - 1) + 2;
			if (prime != 2)
				System.out.println("A prime number besides 2 is: " + (int) prime);
		}

	}

}
