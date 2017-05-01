import java.time.LocalTime;
import java.util.Scanner;

public class Time_Conversion_Part_1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter military time: ");
		int time = input.nextInt();
		
		 System.out.println("Ordinary Time: " + MilitaryToStandardTime(time));
	}
	
	public static String MilitaryToStandardTime(int milTime) {
	      int hour = milTime / 100;
	      int min = milTime % 100;
	      String period;
	      
	      if (hour < 0 || hour > 24 || min < 0 || min > 59) {
	          return "";
	      }	
	      else if (hour > 12) {
	          hour = hour - 12;
	          period = "pm";
	      }
	      else {
	    	  period = "am";
	      }
	      if (hour == 0) {
	          hour = 12;
	      }
	      else if (min == 0) {
	          String StandardTime = hour + " " + period;
	          return StandardTime;
	      }  
	      else if (min < 10 && min > 0) {
	   
	      }
	   
	      String StandardTime = hour + ":" + min + " " + period;
	      return StandardTime;
	      
	    }
	}
	
		
	  
		