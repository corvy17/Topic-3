import java.util.Scanner;

public class Ex6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int Number_years = 30;
		
		System.out.println("Enter the amount invested: ");
		double amount = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double annualInterest = input.nextDouble();
		
		double monthlyInterest = annualInterest / 1200;
		
		System.out.println("Years      Future Value");
		for (int years = 1; years <= Number_years; years ++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", futureInvestmentValue(amount, monthlyInterest, years));
		}
	
	}

	public static Object futureInvestmentValue(double amount, double monthlyInterest, int years) {
		// TODO Auto-generated method stub
		return amount * Math.pow(1 + monthlyInterest, years *12);
	}

}
