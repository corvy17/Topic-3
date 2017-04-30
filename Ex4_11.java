import java.util.Scanner;

public class Ex4_11 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15):");
		int value = input.nextInt();
		
		if (value < 0 || value > 15) {
			System.out.println(value + " is an invalid input");
			System.exit(0);
		}
		
		System.out.println("The hex value is " + 
		Integer.toHexString(value).toUpperCase());
		
	}

	
}
