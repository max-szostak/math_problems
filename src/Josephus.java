import java.util.*;

public class Josephus {
	//Solves the Josephus problem, where a group of soldiers is captured and decides to kill each other rather than face imprisonement. Each
	//soldier kills the remaining man to his left, going around the circle until one is left. This program calculates the survivor.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of positions: ");
		int numPos = scan.nextInt();
		ArrayList<Integer> positions = new ArrayList<Integer>();//List of positions, each index holding its starting position
		
		for (int i = 0; i < numPos; i++)
			positions.add(i);
		
		while (positions.size() > 1)
		{
			ArrayList<Integer> toRemove = new ArrayList<Integer>();//Temporary array to store the positions to be removed after each cycle
			for (int i = 1; i <= positions.size(); i += 2)
				if (i == positions.size())
					toRemove.add(positions.get(0));//Checks for removing the starting position
				else if (i < positions.size())
					toRemove.add(positions.get(i));
			for (int i = 0; i < toRemove.size(); i++)
				positions.remove(positions.indexOf(toRemove.get(i)));//Removes all of the positions for each cycle
		}
		
		System.out.println("The remaining position (starting at 0) is: " + positions.get(0));

	}

}
