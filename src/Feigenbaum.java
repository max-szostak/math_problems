
public class Feigenbaum {
	//In progress. Attempting to calculate stable populations relating to Feigenbaum's constant.
	
	public static double temp = 0.0, FERTILITY = 2.0;
	
	public static double calc(double x)
	{
		if (Math.abs(temp - x) > 0.0000001)
		{
			temp = x;
			System.out.println(temp);
			return calc(FERTILITY * x * (1.0 - x));
		}
		else 
			return x;
	}

	public static void main(String[] args) {	
		double init = 0.5;		
		System.out.println(calc(init));
	}

}
