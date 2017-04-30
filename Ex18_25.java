import java.util.Scanner;

public class Ex18_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = new Scanner(System.in).next();
		System.out.println("All possible permutations of " + s + " are: ");
		
		displayPermutations(s);

	}

	private static void displayPermutations(String s) {
		// TODO Auto-generated method stub
		displayPermutation("", s);
	}

	private static void displayPermutation(String s1, String s2) {
		// TODO Auto-generated method stub
		if (s2.length() == 0) {
			System.out.println(s1);
		}
		else {
			for (int i = 0; i < s2.length(); i++) {
				displayPermutation(s1 + s2.charAt(i), s2.substring(0,  i) + s2.substring(i + 1));
			}
		}
		
	}

}
