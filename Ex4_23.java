import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly rate: ");
		double rate = input.nextDouble();
	
		System.out.print("Enter federal tax withholding rate: ");
		double fedtax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double statetax = input.nextDouble();
		
		double grosspay = hours * rate;
		double fedtaxhold = grosspay * fedtax;
		double statetaxhold = grosspay * statetax;
		double deductions = fedtaxhold + statetaxhold;
		double netpay = grosspay - deductions;
		
		System.out.println("Employee Name: " + name +
				"\nPay Rate: " + formatCurrency(rate) +
				"\nHours Worked: " + hours +
				"\nGross Pay: " + formatCurrency(grosspay) +
				"\nDeductions: " +
				"\n Federal Withholding ("+ formatPercent(fedtax)+"): " + formatCurrency(fedtaxhold) +
				"\n  State Withholding ("+ formatPercent(statetax)+"): " + formatCurrency(statetaxhold) +
				"\n  Total Deduction: " + formatCurrency(deductions) +
				"\nNet Pay: " + formatCurrency(netpay));
	}

	private static String formatCurrency(double money) {
		// TODO Auto-generated method stub
		return DecimalFormat.getCurrencyInstance().format(money);
	}

	private static String formatPercent(double percent) {
		// TODO Auto-generated method stub
		return DecimalFormat.getPercentInstance().format(percent);
	}

}
