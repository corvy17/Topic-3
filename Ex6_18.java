import java.util.Scanner;

public class Ex6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		String password = input.nextLine();
		
		System.out.println(
				(isValidPassword(password) ? "Valid " : "Invalid ") + "Password");

	}

	private static boolean isValidPassword(String password) {
		// TODO Auto-generated method stub
		final int PasswordLength = 8;	
		   final int MinDigits = 2;	

			boolean validPassword = 
				isLengthValid(password, PasswordLength) && 
				isOnlyLettersAndDigits(password) &&
				hasMinDigits(password, MinDigits);

			return validPassword;
	}

	private static boolean hasMinDigits(String password, int n) {
		// TODO Auto-generated method stub
		int NumberDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				NumberDigits++;

			}
			if (NumberDigits >= n) {
				return true;
			}
		}
		return false;
	}

	private static boolean isOnlyLettersAndDigits(String password) {
		// TODO Auto-generated method stub
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}
				return true;		
				
	}

	private static boolean isLengthValid(String password, int password_length) {
		// TODO Auto-generated method stub
		return password.length() >= password_length;
	}

}
