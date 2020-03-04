package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class MathLearningTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.randon return value between 0.0 to 1.0.Multiply with 10 to get
		//number between 0 and 9. Adding 1 , there is more chance of getting 10 as a random number
		int i = (int) (Math.random() *10)+1;
		int j = (int) (Math.random() *10)+1;
		
		System.out.printf("What is %d + %d?",i,j);
		Scanner input = new Scanner(System.in);
		int response = input.nextInt();
		if (response == i+j)
			System.out.println("You are correct!");
		else
			System.out.println("Try Again ;(");
		input.close();
	}

}
