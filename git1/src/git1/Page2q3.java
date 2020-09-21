package git1;
import java.util.Scanner;

public class Page2q3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		int h = Integer.parseInt(text);
		int w = h;
		int x = 0;
		int y = 0;
		while (x != h) { 
			while (y != w) { 
				System.out.print("*");
				y = y + 1;
			}
			x = x + 1;
			
		}
		

	}

}
