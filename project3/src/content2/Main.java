package content2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//System.out.println(LeapYear.isLeapYear(in.nextInt()));

		LeapYear a = new LeapYear();
		System.out.println(a.isLeapYear(in.nextInt()));
		
	}

}
