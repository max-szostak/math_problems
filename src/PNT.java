import java.util.Scanner;
public class PNT {
	//Uses prime number theorem to determine various information about primes.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		double n = scan.nextDouble();
		
		int numPrimes = (int) (n / Math.log(n) + 0.5);
		System.out.println("There are approximately " + numPrimes + " primes below " + (int) n);
		System.out.println("The gap between primes is approximately " + Math.log(n));
		System.out.println("The proportion of primes is approximately " + 1.0 / Math.log(n));
		System.out.println("The nth prime is approximately " + n * Math.log(n));		

	}

}
