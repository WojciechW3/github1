package git1;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of pounds");
		String textv = s.nextLine();
		Float value = Float.parseFloat(textv);
		System.out.println("Do you want to convert to dollars, euros or zloty");
		String currency = s.nextLine();
		if (currency == "dollars") { System.out.println(value + " equals to " + value*1.3 + " dollars!"); }
		
	

	}

}
