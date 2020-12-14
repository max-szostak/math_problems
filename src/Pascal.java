import java.util.Scanner;
public class Pascal {
	//Creates a rough Pascal's triangle.
	
	public static int comb(int n, int r)
	{
		//Computes nCr.
		int nFactorial = 1, rFactorial = 1, nMinusrFactorial = 1;
		for (int i = n; i > 0; i--)
			nFactorial *= i;
		for (int i = r; i > 0; i--)
			rFactorial *= i;
		for (int i = n - r; i > 0; i--)
			nMinusrFactorial *= i;
		return nFactorial / (rFactorial * nMinusrFactorial);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		final int NUM_ROWS = scan.nextInt();

		for (int i = 0; i < NUM_ROWS; i++)
		{
    		for (int j = 0; j < NUM_ROWS / 2 - i / 2; j++)
    			if (i % 2 != 0)
    				System.out.print("       ");
    			else
    				System.out.print("\t");
			for (int k = 0; k <= i; k++)
			{
				if (i % 2 != 0)
					System.out.print("       ");
				else
					System.out.print("\t");
				System.out.print(comb(i, k));
			}
			System.out.println();
		}

	}

}
