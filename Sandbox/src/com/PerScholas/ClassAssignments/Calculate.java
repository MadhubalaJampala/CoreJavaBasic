package com.PerScholas.ClassAssignments;

import java.util.Scanner;

/***
 * This program takes 2 numbers and calculates sum,product and average.
 * @author Student
 *
 */

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get 2 numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 Numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		//Closing the scanner
		input.close();
		//Calculate and Print the sum,product and average.
		System.out.println("Sum =" + (num1 + num2));
		System.out.println("Product =" + (num1 * num2));
		System.out.println("Avg = " + ((num1 + num2) / 2.0));
	}

}
