import java.util.Scanner;

public class Ex18_10 {

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
		int n = (a == str.charAt(0)) ? 1 : 0;
		if (str.length() == 1)
			return n;
		else 
			return n + count(str.substring(1), a);
		
	}

}
