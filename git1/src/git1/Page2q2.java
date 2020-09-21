package git1;

public class Page2q2 {

	public static void main(String[] args) {
		int i = 10;
		int x = 0;
		while (i!=101) {
			int z = 74529 % i;
			if (z == 0) { x = x + 1; }
			i = i + 1;
		}
		System.out.println("The number of factors is " + x);

	}

}
