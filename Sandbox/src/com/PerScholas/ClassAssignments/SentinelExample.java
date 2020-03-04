package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class SentinelExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = -1;
		int sum =0;
		while(i!=0)
		{
			System.out.println("Enter a number to calculate sum. Enter 0 to end:");
			i = input.nextInt();
			sum+=i;
		}
		input.close();
		System.out.println("The total sum of numbers you entered is ="+sum);
	}

}
