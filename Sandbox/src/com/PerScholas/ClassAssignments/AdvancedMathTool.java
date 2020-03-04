package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class AdvancedMathTool {

	public static void main(String[] args) {
		/*Write a program that generates five single digit integer 
		 * subtraction problems using while loop, prompt the user to 
		 * answer all five problems, and reports the number of the correct
		 *  answers. */
		
		Scanner input= new Scanner(System.in);
		int num1,num2,diff;
		int count=0,correct=0;
		int $_ =5;
		System.out.println($_);
		
		while(count<5)
		{
			num1 = (int)(Math.random()*10);
			num2 = (int)(Math.random()*10);
			diff = num1-num2;
			System.out.println(num1 +"-"+num2+"= ?");
			int answer = input.nextInt();
			if(answer==diff)
				correct++;
			count++;
		}
		input.close();
		System.out.println("You answered "+correct+" out of 5 correct.");
	}

}
