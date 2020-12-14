import java.util.Scanner;

public class Sundaram {
	//Uses the Sieve of Sundaram to remove all composite numbers from a list of numbers up to n.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n, the limit of the primes: ");
		int n = scan.nextInt(), m = (n - 2) / 2;
		boolean[] sieve = new boolean[m + 1];
		
		for (int i = 0; i < m; i++)
			sieve[i] = true;
		
		//Let q = 2x + 1. q will be excluded iff x = i + j + 2ij, meaning q = 2(i + j + 2ij) + 1 = (2i + 1)(2j + 1). Therefore an odd integer
		//is excluded iff it can be factored to (2i + 1)(2j + 1), in other words it has an odd factor that is not 1.
		for (int i = 1; i <= m; i++)
			for (int j = i; (i + j + 2 * i * j) <= m; j++)
				sieve[i + j + 2 * i * j] = false;
		
		System.out.println("The primes not including 2 below " + n + " are:");
		for (int i = 1; i <= m; i++)
			if (sieve[i])
				System.out.println(2 * i + 1);
	}

}
