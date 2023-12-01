package selenium_shraddha;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		num = sc.nextInt();
		 if (num>0) {
			 
		
			 System.out.println("number is positive");
		 }
			 
		 else if (num<0) {
		 
		System.out.println("number is negative");
	}
		 else
			 System.out.println("number is 0");
		 
}
}
