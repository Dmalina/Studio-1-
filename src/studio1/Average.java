package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter your first integer: ");
		double n1 = in.nextDouble();
		System.out.println("Enter your second integer: ");
		double n2 = in.nextDouble();
		double n3 = ((n1 + n2)/2);
		System.out.println("Your average is: " + n3);
	}
//
}
