package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class RepeatAddition {

	public static void main(String[] args) {
		// Generate 2 random integers
		int i = (int)(Math.random()*10);
		int j = (int)(Math.random()*10);
		int sum = i+j;
		//Ask the user to enter the sum of the random integers
		Scanner input = new Scanner(System.in);
		System.out.println("What is the sum of "+i+" and "+j);
		int num = input.nextInt();	
		//Repeat till the user enters the right value
		while(num!=sum) {
			System.out.println("Try again.What is the sum of "+i+" and "+j);
			num = input.nextInt();
		}
		input.close();
		System.out.println("Good Job!!");
	}

}
