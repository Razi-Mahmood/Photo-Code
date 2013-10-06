
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int fibonacci(int number) {
		int x = 1;
		int y = 1;
		int change = 0;
		while (true) {
			if (number == x) {
				return y;
			}
			x = x + 1;
			y = y + change;
			change = y - change;
		}
	}
}
