package studio1;

import java.util.Scanner;

public class LeapYear {
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int x = in.nextInt();
		boolean Leap = (x % 4 == 0) && (x % 100 > 0) || (x % 400 == 0);
		System.out.print(Leap);
		// TODO Auto-generated method stub
//
	}

}
