import java.applet.*;
import java.awt.*;

public class ChaosTheory extends Applet{
	//Creates a Sierpinski triangle using random point generation. Relates to chaos theory.
	
	public void init()
	{
		setSize(300, 300);
		setBackground(Color.black);
	}
	
	public void paint(Graphics page)
	{
		
		final int NUM_POINTS = 1000;
		
		page.setColor(Color.blue);
		page.fillOval(50, 250, 6, 6); //corner 0
		page.fillOval(150, 50, 6, 6); //corner 1
		page.fillOval(250, 250, 6, 6); //corner 2
		
		page.setColor(Color.red);
		int x = (int) (Math.random() * 200 + 50);
		int y = (int) (Math.random() * 200 + 50);
		page.fillOval(x, y, 6, 6);
		
		page.setColor(Color.white);
		int count = 0;
		while (count < NUM_POINTS)
		{
			int randCorner = (int) (Math.random() * 3);
			if (randCorner == 0)
			{
				x -= (x - 50) / 2;
				y += (250 - y) / 2;
			}
			if (randCorner == 1)
			{
				if (x < 150)
					x += (150 - x) / 2;
				else
					x -= (x - 150) / 2;
				y -= (y - 50) / 2;
			}
			if (randCorner == 2)
			{
				x += (250 - x) / 2;
				y += (250 - y) / 2;
			}
			page.fillOval(x, y, 3, 3);
			count++;
		}
	}

}