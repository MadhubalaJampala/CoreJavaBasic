package com.PerScholas.ClassAssignments;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of lines for pattern display:");
		int num = input.nextInt();
		input.close();
		//for loop to print number of lines
		for(int i=0;i<num;i++)
		{
			//for loop to print spaces 
			for(int j=num-i;j>1;j--)
				System.out.print(" ");
			//for loop to print *
			for(int k=0;k<=i;k++)
				System.out.print("* ");
			System.out.println();	
		}
		
	}

}
