package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year(YYYY):");
		int year = input.nextInt();
		if(( year % 4 == 0 && year % 4 != 100 )||(year%4==0))
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+ " is not a leap year");
	}

}
