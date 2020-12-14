import java.util.Scanner;
public class Mills {
	//Uses one of Mill's constants to generate primes. Inconsistent due to rounding.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer n: ");
		int n = scan.nextInt();
		
		double mills = 1.3063778838630806;
		int nthPrime = (int) (Math.pow(mills, Math.pow(3, n)));
		
		System.out.println("The nth prime of the sequence is " + nthPrime);

	}

}
