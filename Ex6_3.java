import java.util.Scanner;

public class Ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + " a palindrome.");
		
	}
		private static boolean isPalindrome(int number) {
		// TODO Auto-generated method stub
		return number == reverse(number) ? true : false;
		

	}
		private static int reverse(int number) {
			// TODO Auto-generated method stub
			String reverse = "";
			String n = number + "";
			for (int i = n.length() - 1; i >= 0; i--){
				reverse += n.charAt(i);
			}
			return Integer.parseInt(reverse);
		}

	
	

}
