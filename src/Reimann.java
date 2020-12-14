import java.util.Scanner;
public class Reimann {
	//Calculates approximate values of Reimann Zeta Function, for real values of s.

	public static void main(String[] args) {
		
		double sum = 0.0, base = 1.0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the s constant: ");
		final double POWER = scan.nextFloat();	
		System.out.println("Calculating...");
		for (int i = 0; i < 2E9; i++)
		{
			sum += 1 / Math.pow(base, POWER);
			base++;
		}
		System.out.println("Zeta(" + POWER + ") is approximately " + sum);
	}

}
