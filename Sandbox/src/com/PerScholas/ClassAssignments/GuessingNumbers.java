package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class GuessingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int r = (int)(Math.random()*100);
		System.out.println("Random Number:"+r);
		System.out.println("Guess the number:");
		int n = input.nextInt();
		while(r!=n)
		{
			if(r<n)
				System.out.println("Too High.");
			else
				System.out.println("Too low");
			System.out.println("Try again.Guess the number:");
			n=input.nextInt();
		}
		input.close();
		System.out.println("Good Job!!");		
	}
}
