
public class Ex6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int char_per_line = 10;
		char ch1 = '1';
		char ch2 = 'Z';
		
		System.out.println("\nCharacters per 1 to Z");
		printChars(ch1, ch2, char_per_line);
		System.out.println();
		
				
	}

	private static void printChars(char ch1, char ch2, int char_per_line) {
		// TODO Auto-generated method stub
		for (char c = ch1, count = 1; c <= ch2; c++) {
			if (count % char_per_line == 0)
				System.out.println(c);
			else 
				System.out.print(c + " ");
		}
	}

}
