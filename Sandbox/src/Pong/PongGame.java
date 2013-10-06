package Pong;

public class PongGame {

	public static void main(String[] args) {
		Zen.create(500, 500);
		drawBackground();
		Zen.setColor(255, 255, 255);
		Zen.fillRect(0, 0, 500, 500);
		Zen.setColor(0, 0, 0);
		Zen.drawLine(250, 0, 250, 500);
		Ball Razi = new Ball();
		Razi.draw();
		
		while (true) {
			drawBackground();
			Razi.draw();
			Razi.move();
			Zen.sleep(33);
		}
	}
	
	public static void drawBackground()
	{
		Zen.setColor(255, 255, 255);
		Zen.fillRect(0, 0, 500, 500);
	}
}
