package tw.com.studio.jimmy.lab;

public class Main {

	public static void main(String[] args) {
		// X>=Y
		int x = 126;
		int y = 90;
		int r = 0;
		do {
			r = x % y;
			x = y;
			y = r;
		} while (r != 0);
		System.out.println(String.valueOf(x));
	}
}
