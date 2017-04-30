import java.util.Scanner;

public class Ex18_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a list of characters in one line: ");
		String s = input.nextLine();
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		
		char [] chars = s.replaceAll("", " ").toCharArray ();
		System.out.println("The occurences of " + ch + "in " + s + "\"=" + count(chars, ch));

	}

	private static int count(char[] chars, char ch) {
		// TODO Auto-generated method stub
		return count (chars, ch, chars.length - 1);
	}

	private static int count(char[] chars, char ch, int high) {
		// TODO Auto-generated method stub
		int count = (chars[high] == ch) ? 1 : 0;
		if (high == 0)
			return count;
		else
			return count + count(chars, ch, high - 1);
	}

}
