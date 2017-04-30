import java.util.Scanner;

public class Ex18_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.next();
		char a = input.next().charAt(0);
		System.out.println(count(str, a));

	}

	private static int count(String str, char a) {
		// TODO Auto-generated method stub
		return count(str, a, str.length() - 1);
	}

	private static int count(String str, char a, int high) {
		// TODO Auto-generated method stub
		int n = (a == str.charAt(0)) ? 1 : 0;
		if (high <= 0)
			return n;
		return n + count(str.substring(1), a, high - 1);
	}

}
