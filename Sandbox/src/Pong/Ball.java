package Pong;

public class Ball {
	int x = 250;
	int y = 250;
	
	int dx = 4;
	int dy = 2;

	public void move()
	{
		x = x + dx;
		y = y + dy;
		
		if (x > 475) {
			dx = -1 * dx; 
		}
		if (y > 475) {
			dy = -1 * dy; 
		}
		if (x < 200) {
			dx = -1 * dx; 
		}
		if (y < 200) {
			dy = -1 * dy; 
		}
	}

	public void draw()
	{
		Zen.setColor(71, 168, 66);
		Zen.fillOval(x, y, 20, 20);
	}
}
