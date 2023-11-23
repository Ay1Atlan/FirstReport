package day07_ifStatement;

public class Implementing {
	public static void main(String[] args) {
		int day = 1;

	     if (day == 1){
	        System.out.println("Monday");
	    }else if (day == 2) {
	        System.out.println("Tuesday");
	    }else if (day == 3) {
	        System.out.println("Wednesday");
	    }else if (day == 4) {
	        System.out.println("Thursday");
	    }else if (day == 5) {
	        System.out.println("Friday");
	    }else if (day == 6) {
	        System.out.println("Saturday");
	    }else if (day == 7) {
	        System.out.println("Sunday");
	    }else {
	        System.out.println("Invalid number of the day");
	    }
	     
	     System.out.println("End of if statement");

	 
	         
	         double num1=-1.0;
	         double num2=4.5;
	         double num3=-5.3;
	         
	         if(num1>=num2 & num1>=num3) {
	             System.out.println(num1);
	         }    else if (num2>=num1 && num2>=num3)  {
	             System.out.println(num2);
	         }    else {
	             System.out.println(num3);
	         }
	             
	         
	             
	     }
	}
