package test;

import java.util.Scanner;

	public class DaysInMonth {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the month 1-12");
	        int month = scanner.nextInt();
	        scanner.close();
	        

	        int daysInMonth;
	        
	       
	     

	        if (month == 2) {
	          // February
	        	daysInMonth = 28;
	           
	        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
	            // April, June, September, November
	        	 daysInMonth = 30;
	            
	        } else {
	            // January, March, May, July, August, October, December
	        	   daysInMonth = 31;
	            
	        }

	        System.out.println("Number of days in the selected month: " + daysInMonth);
	    }
	}



