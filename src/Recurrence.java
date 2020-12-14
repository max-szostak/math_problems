import java.util.*;
public class Recurrence {
	//Generates primes using GCD's.
	
	public static int gcd(int a, int b)
	{
		//Returns GCD of a and b (positive integers). Calculates g (always odd) and d in the formula GCD = g * 2^d.
		int d = 0;
		while (a % 2 == 0 && b % 2 == 0)//2 is a common divisor, eliminate it and increment d
		{
			a /= 2;
			b /= 2;
			d++;
		}
		while (a != b)
		{
			if (a % 2 == 0)//2 is not a common divisor, eliminate and continue
				a /= 2;
			else if (b % 2 == 0)//2 is not a common divisor, eliminate and continue
				b /= 2;
			else if (a > b)		//Let c = a - b. Any number that is a common divisor of a and b is also a divisor of c. Thus (a, b) and 
				a = (a - b) / 2;//(b, c) have the same common divisors, so replace (a, b) with (c/2, b).
			else 
				b = (b - a) / 2;	
		}
		return (int) (a * Math.pow(2, d));
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of primes to be generated (expect high run time): ");
		int numPrimes = scan.nextInt();
		int primeCount = 0, current = 7, next, runCount = 1, result;
		ArrayList previousPrimes = new ArrayList();
		System.out.println("Primes: ");
		
		while (primeCount < numPrimes)
		{
			next = current + gcd(runCount, current);
			result = next - current;
			if (result != 1 && !previousPrimes.contains(new Integer(result)))
			{
				primeCount++;
				previousPrimes.add(result);
				System.out.println(result);
			}
			runCount++;
			current = next;
		}

	}

}
