package git1;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter some numbers");
		boolean i = true;
		int x = 0;
		while (i == true) {
			

			String text = s.nextLine();
			int z = Integer.parseInt(text);   
			
			x = x + z;
			if (z == 0) { i = false; }






		}
		if (i == false) { System.out.println("The sum of the numbers is " + x);
		}
	}
}
